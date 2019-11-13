package reports

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.util.KeywordUtil

import helper.ExcelUtils
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ReportForProductUpdate extends ExcelUtils{

	private TestData excelFile = findTestData('Data Files/Sources/report')

	/*
	 * if data in db is different from data in the 'input xls' file - 
	 * then ONLY - would the entry of the NEW VALUE be shown in the particular column of the particular row 
	 * ...in the report
	 * 
	 * So if my input xls file has 30 rows x 30 columns. 
	 * my report will have the same xls file...except only the values that change will be shown in the cells. 
	 * the rest will be blank 
	 * 
	 * A blank cell means the value in the xls file was not different than that existing in the db.
	 */

	public boolean evaluateValue(String database, String file, String headerName){
		WebUI.takeScreenshot()
		int columnIndex = getColumnIndex(headerName)
		String DATABASE_VALUE = "Database Value: '" + database + "'"
		String EXCEL_VALUE 	  = "File value: '" + file + "'"
		KeywordUtil.logInfo(DATABASE_VALUE)
		KeywordUtil.logInfo(EXCEL_VALUE)
		if (database!=file){
			writeOldCell(excelFile.getSourceUrl(), 0, GlobalVariable.ROW, columnIndex, DATABASE_VALUE + " " + EXCEL_VALUE)
		}
	}

	public int getColumnIndex(headerName){
		List <String> columnNames = excelFile.getColumnNames()
		if (!columnNames.contains(headerName)){
			KeywordUtil.markFailedAndStop("Column Name '"+ headerName +"' not found")
		}
		return columnNames.indexOf(headerName)
	}
}
