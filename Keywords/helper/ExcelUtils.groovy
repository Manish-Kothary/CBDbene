package helper

import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.util.KeywordUtil

public class ExcelUtils {

	public static writeCell(path, docSheet, row, column, value){
		KeywordUtil.logInfo(">>> Writing to doc " + path + " on row " + row + " column " + column + " DATA: " + value)
		FileInputStream file = new FileInputStream (new File(path));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(docSheet);
		sheet.createRow(row).createCell(column).setCellValue(value)
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path));
		workbook.write(outFile);
		outFile.close();
	}

	public static writeOldCell(path, docSheet, row, column, value){
		KeywordUtil.logInfo(">>> Writing to doc " + path + " sheet " + docSheet +" on row " + row + " column " + column + " DATA: " + value)
		FileInputStream file = new FileInputStream (new File(path));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(docSheet);
		sheet.getRow(row).createCell(column).setCellValue(value);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path));
		workbook.write(outFile);
		outFile.close();
	}

	public static String readCell(path, docSheet, row, column){
		KeywordUtil.logInfo(">>> Reading from doc " + path + " sheet " + docSheet + " on row " + row + " column " + column)
		FileInputStream file = new FileInputStream (new File(path))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(docSheet);
		//		String cell = sheet.getRow(row).getCell(column).getStringCellValue();
		DataFormatter formatter = new DataFormatter();
		String cell = formatter.formatCellValue(sheet.getRow(row).getCell(column));
		file.close();
		KeywordUtil.logInfo(">>> FOUND: " + cell)
		return cell;
	}

	public static int readIntCell(path, docSheet, row, column){
		FileInputStream file = new FileInputStream (new File(path))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(docSheet);
		int cell = sheet.getRow(row).getCell(column).numericCellValue
		file.close();
		return cell;
	}

	public static String readCellNoLog(path, docSheet, row, column){
		FileInputStream file = new FileInputStream (new File(path))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(docSheet);
		String cell = sheet.getRow(row).getCell(column).getStringCellValue();
		file.close();
		return cell;
	}

	public static nullCell(path, docSheet, row, column){
		KeywordUtil.logInfo(">>> Writing to doc " + path + " on row " + row + " NULL")
		FileInputStream file = new FileInputStream (new File(path));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(docSheet);
		sheet.createRow(row).createCell(column).setCellValue("")
		sheet.getRow(row).CREATE_NULL_AS_BLANK
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path));
		workbook.write(outFile);
		outFile.close();
	}
}
