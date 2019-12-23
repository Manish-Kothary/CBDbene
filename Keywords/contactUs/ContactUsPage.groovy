package contactUs

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class ContactUsPage extends BasePage{

	private static final TestObject INPUT_NAME 		  = findTestObject('ContactUsPage/input_name')
	private static final TestObject INPUT_EMAIL 	  = findTestObject('ContactUsPage/input_email')
	private static final TestObject INPUT_MESSAGE 	  = findTestObject('ContactUsPage/input_message')
	private static final TestObject BUTTON_SEND_EMAIL = findTestObject('ContactUsPage/button_send_email')
	private static final TestObject CHECKBOX_TOPIC	   = findTestObject('ContactUsPage/button_send_email')

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

	public void selectTopic(int indexTopic){
		KeywordUtil.logInfo("Topic selected: " + indexTopic.toString())
		TestObject topic = findTestObject('Object Repository/ContactUsPage/checkbox_topic',[('index') : indexTopic])
//		WebOp.scrollToElement(topic)
//		WebUI.delay(3)
		WebUI.click(topic)
	}
}
