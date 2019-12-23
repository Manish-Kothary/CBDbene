package loginPage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain

import base.BasePage

public class LoginPage extends BasePage{
	
	private static final TestObject INPUT_EMAIL		 = findTestObject('LoginPage/input_email'),
									INPUT_PASSWORD   = findTestObject('LoginPage/input_password'),
							LINK_FORGOT_PASSWORD  	 = findTestObject('LoginPage/link_forgot_password'),
						    LINK_CREATE_YOUR_ACCOUNT = findTestObject('LoginPage/link_forgot_password'),		
						    BUTTON_LOGIN			 = findTestObject('LoginPage/button_Login'),
							BUTTON_CREATE_YOUR_BENE_ACCOUNT = findTestObject('LoginPage/button_create_account'),
							BUTTON_REGISTER			 = findTestObject('LoginPage/button_register'),
							SIDEBAR = findTestObject("LoginPage/sidebar"),
							TEXT_ACCOUNT_ALREADY_REGISTERED = findTestObject('LoginPage/text_account_already_registered'),
							ICON_CLOSE_SIDEBAR = findTestObject('Object Repository/LoginPage/icon_close_sidebar')
	
	public LoginPage(){
		WebOp.waitForElementVisible(INPUT_EMAIL)
		WebOp.waitForElementVisible(INPUT_PASSWORD)
	}
									
	public void enterEmail(String email){
		WebUI.click(INPUT_EMAIL)
		WebUI.setText(INPUT_EMAIL, email)
	}
	
	public void enterPassword(String password){
		WebUI.click(INPUT_PASSWORD)
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

	public void clickRegisterButton(){
		WebUI.delay(1)
		WebUI.click(BUTTON_REGISTER)
		WebUI.delay(1)
	}
	
	public void clickCreateYourBeneAccount(){
		WebOp.scrollToElement(BUTTON_CREATE_YOUR_BENE_ACCOUNT)
		WebUI.delay(1)
		WebUI.click(BUTTON_CREATE_YOUR_BENE_ACCOUNT)
	}
	
	public void register(String email, String password){
		enterEmail(email)
		enterPassword(password)
		clickRegisterButton()
	}
	
	public boolean accountAlreadyRegistered() {
		WebUI.waitForElementVisible(TEXT_ACCOUNT_ALREADY_REGISTERED, 1)
	}
	
	public void closeSideBar(){
		WebUI.click(ICON_CLOSE_SIDEBAR)
		WebUI.delay(1)
	}
}
