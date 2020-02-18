package ambasaddorLogin

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage
import loginPage.LoginPage

public class AmbassadorLoginPage extends BasePage{

	private static final TestObject LINK_REGISTRATION = findTestObject('Object Repository/AmbassadorLoginPage/link_registration')
	private static final TestObject INPUT_EMAIL = findTestObject('Object Repository/AmbassadorLoginPage/input_email')
	private static final TestObject INPUT_PASSWORD = findTestObject('Object Repository/AmbassadorLoginPage/input_password')
	private static final TestObject BUTTON_LOGIN = findTestObject('Object Repository/AmbassadorLoginPage/button_login')
	
	
	public AmbassadorLoginPage(){
		Assert.assertTrue("Page not loaded", WebOp.waitForElementVisible(LINK_REGISTRATION))
	}

	public void clickRegistrationLink(){
		WebUI.delay(1)
		WebUI.click(LINK_REGISTRATION)
	}
	
	 public void login(String email, String password){
		 WebUI.setText(INPUT_EMAIL, email)
		 WebUI.setText(INPUT_PASSWORD, password)
		 WebUI.click(BUTTON_LOGIN)
	 }
}
