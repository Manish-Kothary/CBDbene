package loginPage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain

import base.BasePage

public class LoginPage extends BasePage{
	
	private static final TestObject INPUT_EMAIL		 = findTestObject('Object Repository/LoginPage/input_email'),
									INPUT_PASSWORD   = findTestObject('Object Repository/LoginPage/input_password'),
							LINK_FORGOT_PASSWORD  	 = findTestObject('Object Repository/LoginPage/link_forgot_password'),
						    LINK_CREATE_YOUR_ACCOUNT = findTestObject('Object Repository/LoginPage/link_forgot_password'),		
						    BUTTON_LOGIN			 = findTestObject('Object Repository/LoginPage/button_Login'),
							BUTTON_CREATE_YOUR_BENE_ACCOUNT = findTestObject('Object Repository/LoginPage/button_create_account')
	
	public LoginPage(){
		
	}
									
	public void enterEmail(String email){
		WebUI.setText(INPUT_EMAIL, email)
	}
	
	public void enterPassword(String password){
		WebUI.setText(INPUT_PASSWORD, password)
	}
	
	public void enterEncryptedPassword(String password){
		WebUI.setEncryptedText(INPUT_PASSWORD, password)
	}
	
	public void clickButtonLogin(){
		WebUI.click(BUTTON_LOGIN)
	}
	
	public void encryptedLogin(String email, String encryptedPassword){
		enterEmail(email)
		enterEncryptedPassword(encryptedPassword)
		clickButtonLogin()
	}
	
	public void login(String email, String password){
		enterEmail(email)
		enterPassword(password)
		clickButtonLogin()
	}
	
	public void clickLinkForgotPassword(){
		WebUI.click(LINK_FORGOT_PASSWORD)
	}
	
	public void clickCreateYourBeneAccount(){
		WebOp.scrollToElement(BUTTON_CREATE_YOUR_BENE_ACCOUNT)
		WebUI.delay(1)
		WebUI.click(BUTTON_CREATE_YOUR_BENE_ACCOUNT)
	}
}
