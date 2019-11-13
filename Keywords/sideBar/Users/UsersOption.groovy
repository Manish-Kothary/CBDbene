package sideBar.Users

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

public class UsersOption {
	
	private static final TestObject OPTION_USERS	   = findTestObject('Object Repository/SideBar/UsersOption/UserOption')
	private static final TestObject SUBOPTION_USER_MANAGEMENT = findTestObject('Object Repository/SideBar/UsersOption/suboption_user_management')
	
	public void selectUserManagementOption(){
		WebUI.click(OPTION_USERS)
		WebUI.waitForElementVisible(SUBOPTION_USER_MANAGEMENT, 5)
		WebUI.click(SUBOPTION_USER_MANAGEMENT)
	}
}
