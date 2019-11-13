package userManagement

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class UserManagementPage extends BasePage{

	private static final TestObject INPUT_SEARCH = findTestObject('Object Repository/UserManagementPage/input_search')
	private static final TestObject BUTTON_DELETE_1 = findTestObject('Object Repository/UserManagementPage/button_delete')
	private static final TestObject MESSAGE_1_RESULT = findTestObject('Object Repository/UserManagementPage/message_1_result')
	private static final TestObject MESSAGE_0_RESULT = findTestObject('Object Repository/UserManagementPage/message_0_result')
	private static final TestObject BUTTON_ACCEPT_DELETE = findTestObject('Object Repository/UserManagementPage/button_accept_delete_user')
	
	public void searchUser(String user){
		WebUI.setText(INPUT_SEARCH, user)
	}
	
	public boolean checkResults(){
		return WebUI.waitForElementVisible(MESSAGE_1_RESULT, 3)
	}

	public void deleteUser(){
		WebUI.click(BUTTON_DELETE_1)
		WebOp.waitForElementVisible(BUTTON_ACCEPT_DELETE)
		WebUI.click(BUTTON_ACCEPT_DELETE)
	}
}
