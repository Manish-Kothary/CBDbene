package contactUs

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class ContactUsPage extends BasePage{
	
	private static final TestObject INPUT_NAME 		  = findTestObject('Object Repository/ContactUsPage/input_name')
	private static final TestObject INPUT_EMAIL 	  = findTestObject('Object Repository/ContactUsPage/input_email')
	private static final TestObject INPUT_MESSAGE 	  = findTestObject('Object Repository/ContactUsPage/input_message')
	private static final TestObject BUTTON_SEND_EMAIL = findTestObject('Object Repository/ContactUsPage/button_send_email')
	
	public void fillForm(String name, String email, String message){
		enterName(name)
		enterEmail(email)
		enterMessage(message)
	}
	
	public void enterName(String name){
		WebUI.setText(INPUT_NAME, name)
	}
	
	public void enterEmail(String email){
		WebUI.setText(INPUT_EMAIL, email)
	}
	public void enterMessage(String message){
		WebUI.setText(INPUT_MESSAGE, message)
	}
	public void clickSendEmailButton(){
		WebOp.visualizeElementAndClick(BUTTON_SEND_EMAIL)
	}
}
