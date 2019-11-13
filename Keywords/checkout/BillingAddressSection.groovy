package checkout

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class BillingAddressSection extends BasePage{

	private static final TestObject SPAN_ADD_A_ADDRESS = findTestObject('Object Repository/CBDbene/1/Page_Ben  Checkout/p_Add a Address'),
	INPUT_FIRST_NAME = findTestObject('Object Repository/CBDbene/Page_Ben  Checkout/input_First Name_billing_first_name'),
	INPUT_LAST_NAME  = findTestObject('Object Repository/CBDbene/Page_Ben  Checkout/input_Last Name_billing_last_name'),
	INPUT_PHONE	     = findTestObject('Object Repository/CBDbene/Page_Ben  Checkout/input_Email Address_form-control'),
	INPUT_EMAIL		 = findTestObject('Object Repository/CBDbene/Page_Ben  Checkout/input_Email Address_billing_email_name'),
	INPUT_ADDRESS	 = findTestObject('Object Repository/zz/Page_Ben  Checkout/input_Address_other'),
	INPUT_COUNTRY 	 = findTestObject('Object Repository/zz/Page_Ben  Checkout/input_Country_country'),
	INPUT_STATE 	 = findTestObject('Object Repository/zz/Page_Ben  Checkout/input_State_state'),
	INPUT_CITY		 = findTestObject('Object Repository/zz/Page_Ben  Checkout/input_City_city'),
	INPUT_ZIP_CODE 	 = findTestObject('Object Repository/zz/Page_Ben  Checkout/input_Zip Code_zip'),
	INPUT_SEARCH_ADDRESS = findTestObject('Object Repository/BillingAddressSection/input_search_address')

	public void displayAddressSection(){
		WebUI.click(SPAN_ADD_A_ADDRESS)
	}

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

	public void enterAddress(String address){
		WebUI.setText(INPUT_ADDRESS, address)
	}

	public void enterCountry(String country){
		WebUI.setText(INPUT_COUNTRY, country)
	}

	public void enterState(String state){
		WebUI.setText(INPUT_STATE, state)
	}

	public void enterCity(String city){
		WebUI.setText(INPUT_CITY, city)
	}

	public void enterZipCode(String zipCode){
		WebUI.setText(INPUT_ZIP_CODE, zipCode)
	}

	public void enterData(String firstName, String lastName, String email, String phone, String address, String country,
			String state, String city, String zipCode){
		enterFirstName(firstName)
		enterLastName(lastName)
		enterEmail(email)
		enterPhone(phone)
		enterZipCode(zipCode)
		enterAddress(address)
//		searchAddress(address)
		enterCountry(country)
		enterState(state)
		enterCity(city)
		WebUI.delay(5)
		searchAddress(address)
	}
			
	public void searchAddress(String address){
		WebOp.sendKeys(INPUT_SEARCH_ADDRESS, address)
	}
}
