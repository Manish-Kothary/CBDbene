package forgotYourPassword

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class ForgotYourPasswordPage extends BasePage{

	private static final TestObject INPUT_EMAIL  = findTestObject('Object Repository/ForgotYourPasswordPage/input_email'),
	BUTTON_RESET = findTestObject('Object Repository/ForgotYourPasswordPage/button_reset')

	public void enterEmail(String email){
		WebUI.setText(INPUT_EMAIL, email)
	}

	public void clickResetButton(){
		WebUI.click(BUTTON_RESET)
	}
	
	public void resetEmail(String email){
		enterEmail(email)
		clickResetButton()
	}
}
