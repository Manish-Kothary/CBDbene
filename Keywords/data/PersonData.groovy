package data

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.util.KeywordUtil

public class PersonData {

	private static final TestData EXCEL_FILE = findTestData('Data Files/registration_details')

	public int getQuantity(){
		return EXCEL_FILE.getRowNumbers()
	}

	public Person getPerson(int row){
		String firstName = EXCEL_FILE.getValue("CONTACT FIRST NAME", row)
		String lastName  = EXCEL_FILE.getValue("CONTACT LAST NAME", row)
		String address1  = EXCEL_FILE.getValue("Address Line 1", row)
		String address2  = EXCEL_FILE.getValue("Address Line 2", row)
		String city    	 = EXCEL_FILE.getValue("CITY", row)
		String state   	 = EXCEL_FILE.getValue("ST", row)
		String phone   	 = EXCEL_FILE.getValue("PHONE NUMBER", row)
		String email   	 = EXCEL_FILE.getValue("E MAIL ADDRESS", row)
		String zipCode   = EXCEL_FILE.getValue("ZIP CODE", row)
		KeywordUtil.logInfo("First Name: " + firstName)
		KeywordUtil.logInfo("Last Name: " + lastName)
		KeywordUtil.logInfo("Address 1: " + address1)
		KeywordUtil.logInfo("Address 2: " + address2)
		KeywordUtil.logInfo("City: " + city)
		KeywordUtil.logInfo("State: " + state)
		KeywordUtil.logInfo("Phone: " + phone)
		KeywordUtil.logInfo("Email: " + email)
		KeywordUtil.logInfo("Zip Code: " + zipCode)
		return new Person(firstName,lastName,address1,address2,city,state,zipCode,phone,email)
	}
}
