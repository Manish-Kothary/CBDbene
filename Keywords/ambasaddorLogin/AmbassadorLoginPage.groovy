package ambasaddorLogin

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage
import loginPage.LoginPage

public class AmbassadorLoginPage extends BasePage{
	
	private static final TestObject LINK_REGISTRATION = findTestObject('Object Repository/AmbassadorLoginPage/link_registration')
	private LoginPage loginPage = new LoginPage()
	
	public AmbassadorLoginPage(){
		Assert.assertTrue("Page not loaded", WebOp.waitForElementVisible(LINK_REGISTRATION))
	}
	
	public void clickRegistrationLink(){
		WebUI.delay(1)
		WebUI.click(LINK_REGISTRATION)
	}
	
	public void login(String email, String password){
		loginPage.login(email, password)
	}
}
