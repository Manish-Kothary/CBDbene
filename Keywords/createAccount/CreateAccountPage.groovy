package createAccount

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage
import data.Person

public class CreateAccountPage extends BasePage{

	private static final TestObject INPUT_FIRST_NAME = findTestObject('Object Repository/CreateAccountPage/input_first_name'),
	INPUT_LAST_NAME  = findTestObject('Object Repository/CreateAccountPage/input_last_name'),
	INPUT_PHONE	     = findTestObject('Object Repository/CreateAccountPage/input_phone'),
	INPUT_PASSWORD   = findTestObject('Object Repository/CreateAccountPage/input_password'),
	INPUT_RE_ENTER_PASSWORD   = findTestObject('Object Repository/CreateAccountPage/input_re_enter_password'),
	INPUT_EMAIL		 = findTestObject('Object Repository/CreateAccountPage/input_email'),
	BUTTON_REGISTER  = findTestObject('Object Repository/CreateAccountPage/button_register'),
	TEXT_ERROR_EMAIL_TAKEN  = findTestObject('Object Repository/CreateAccountPage/text_email_taken'),
	TEXT_ERROR_EMAIL  = findTestObject('Object Repository/CreateAccountPage/error_message_email')
	
	public void enterFirstName(String firstName){
		WebUI.setText(INPUT_FIRST_NAME, firstName)
	}

	public void enterLastName(String firstName){
		WebUI.setText(INPUT_LAST_NAME, firstName)
	}

	public void enterEmail(String email) {
		WebUI.setText(INPUT_EMAIL, email)
	}

	public void enterPhone(String phone){
		WebUI.setText(INPUT_PHONE, phone)
	}

	public void enterPassword(String password){
		WebUI.setText(INPUT_PASSWORD, password)
	}

	public void enterConfirmPassword(String password){
		WebUI.setText(INPUT_RE_ENTER_PASSWORD, password)
	}

	public void clickRegisterButton(){
		WebOp.scrollToElement(BUTTON_REGISTER)
		WebUI.delay(1)
		WebUI.click(BUTTON_REGISTER)
	}
	
	public boolean findErrorMessageEmailTaken(){
		return WebUI.waitForElementVisible(TEXT_ERROR_EMAIL_TAKEN, 5)
	}
	
	public void validateEmailNotTaken(){
		if (findErrorMessageEmailTaken()){
			KeywordUtil.markFailedAndStop("Email Taken Message found.")
		}
		else{
			KeywordUtil.markPassed("Email Taken Message not found.")
		}
	}
	
	public String getErrorMessageWrongEmail(){
		return WebUI.getText(TEXT_ERROR_EMAIL)
	}
	
	public void enterAccountInformation(Person person, String password){
		enterAccountInformation(person.getFirstName(), person.getLastName(), person.getEmail(), person.getPhone(), password)
	}
	
	public void enterAccountInformation(String firstName, String lastName, String email, String phone, String password){
		enterFirstName(firstName)
		enterLastName(lastName)
		enterEmail(email)
		enterPhone(phone)
		enterPassword(password)
		enterConfirmPassword(password)
	}
}
