package ambassadorApplication

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage
import createAccount.CreateAccountPage
import data.Person

public class AmbassadorApplicationPage extends BasePage{

	private CreateAccountPage registration = new CreateAccountPage()
	private static final TestObject INPUT_PROFESSION  = findTestObject('AmbassadorApplicationPage/input_profession')
	private static final TestObject INPUT_WEBSITE     = findTestObject('AmbassadorApplicationPage/input_website')
	private static final TestObject INPUT_INSTAGRAM   = findTestObject('AmbassadorApplicationPage/input_instagram')
	private static final TestObject INPUT_FACEBOOK    = findTestObject('AmbassadorApplicationPage/input_facebook')
	private static final TestObject INPUT_ZIP_CODE    = findTestObject('AmbassadorApplicationPage/input_zip_code')
	private static final TestObject SELECT_NETWORK    = findTestObject('AmbassadorApplicationPage/select_network')
	private static final TestObject INPUT_REASON      = findTestObject('AmbassadorApplicationPage/input_reason')
	private static final TestObject TEXT_SUCCESSFUL_APPLICATION      = findTestObject('Object Repository/AmbassadorApplicationPage/text_successful_application')

	public void enterData(Person person,String password, String profession, String website, String instagram, String facebook, 
						  String reason, String network){
		   enterData(person.getFirstName(),person.getLastName(),person.getEmail(),person.getPhone(),password,profession,website,instagram,facebook,person.getZipCode(),reason,network)
	}
	
	public void enterData(String firstName, String lastName, String email, String phone, String password, 
						  String profession, String website, String instagram, String facebook, 
						  String zipCode, String reason, String network){
		registration.enterAccountInformation(firstName, lastName, email, phone, password)
		enterProfession(profession)
		enterWebsite(website)
		enterInstagram(instagram)
		enterFacebook(facebook)
		enterZipCode(zipCode)
		enterReason(reason)
		selectNetwork(network)
	}
	
	public void enterProfession(String profession){
		WebUI.setText(INPUT_PROFESSION, profession)
	}
	
	public void enterWebsite(String website){
		WebUI.setText(INPUT_WEBSITE, website)
	}
	
	public void enterInstagram(String instagram) {
		 WebUI.setText(INPUT_INSTAGRAM, instagram)
	}
	
	public void enterFacebook(String facebook){
		WebUI.setText(INPUT_FACEBOOK, facebook)
	}
	
	public void enterZipCode(String zipCode){
		WebUI.setText(INPUT_ZIP_CODE, zipCode)
	}
	
	public void enterReason(String reason){
		WebUI.setText(INPUT_REASON, reason)
	}
	
	public void selectNetwork(String value){
		WebOp.selectOptionByLabel(SELECT_NETWORK, value)
	}
	
	public void clickRegisterButton(){
		registration.clickRegisterButton()
	}
	
	public void validateEmailNotTaken(){
		registration.validateEmailNotTaken()
	}
	
	public void validateSuccessfulApplication(){
		Assert.assertTrue("Successful Application message not found after 10 seconds.", WebUI.waitForElementVisible(TEXT_SUCCESSFUL_APPLICATION,10))
	}
	
	
}
