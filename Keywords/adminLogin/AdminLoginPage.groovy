package adminLogin

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class AdminLoginPage extends BasePage{

	private static final TestObject INPUT_ADMIN_EMAIL 	 = findTestObject('Object Repository/AdminLoginPage/input_email')
	private static final TestObject INPUT_ADMIN_PASSWORD = findTestObject('Object Repository/AdminLoginPage/input_password')
	private static final TestObject BUTTON_LOGIN	 	 = findTestObject('Object Repository/AdminLoginPage/button_login')

	public void login (String email, String password){
		enterEmail(email)
		enterPassword(password)
		clickLoginButton()
	}

	public void encryptedLogin(String email, String password){
		enterEmail(email)
		enterEncryptedPassword(password)
		clickLoginButton()
	}

	public void enterEmail(String email){
		WebUI.setText(INPUT_ADMIN_EMAIL, email)
	}

	public void enterEncryptedPassword(String password){
		WebUI.setEncryptedText(INPUT_ADMIN_PASSWORD, password)
	}

	public void clickLoginButton(){
		WebUI.click(BUTTON_LOGIN)
	}

	public void enterPassword(String password){
		WebUI.setText(INPUT_ADMIN_PASSWORD, password)
	}
}
