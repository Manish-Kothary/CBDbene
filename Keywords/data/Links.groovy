package data

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Links {

	private static final TestData EXCEL_LINKS = findTestData('Data Files/Sources/links')

	public int getQuantity(){
		return EXCEL_LINKS.getRowNumbers()
	}

	public String getLink(int row){
		return EXCEL_LINKS.getValue("Links", row)
	}

	public String getName(int row){
		return row.toString() + "_" + getSuffix(getLink(row))
	}

	public String getSuffix(String fullURL){
		int suffixIndex = fullURL.lastIndexOf("/") + 1
		int lastIndex = fullURL.length()
		if (fullURL.contains("?")) {
			lastIndex = fullURL.indexOf("?")
		}
		return fullURL.substring(suffixIndex,lastIndex)
	}
}
