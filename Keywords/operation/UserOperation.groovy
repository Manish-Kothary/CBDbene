package operation

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import data.Person

public class UserOperation {
	
	private static final TestCase ADD_A_PRODUCT = findTestCase('SubTestCase/Add_Product_To_Cart')
	private static final TestCase CREATE_ORDER  = findTestCase('SubTestCase/Create_Order')
	private static final TestCase USER_REGISTRATION  = findTestCase('SubTestCase/Registration')
	
	public void addProductToMyCart(int quantity){
		for (int i = 0; i < quantity ; i++) {
			WebUI.callTestCase(ADD_A_PRODUCT, [:])
		}
	}
	
	public void addProductToMyCart(){
		addProductToMyCart(1)
	}

	public void checkout (Person person){
		checkout(person.getFirstName(), person.getLastName(), person.getEmail(), person.getPhone(), person.getAddress1(),
			person.getCountry(), person.getState(), person.getCity(), person.getZipCode())
	}
	
	public void checkout(String firstName, String lastName, String email, String phone, String address, String country, String state,
		String city, String zipCode){
		WebUI.callTestCase(CREATE_ORDER, [('firstName') : firstName, ('lastName') : lastName, ('email') : email, 
			('phone') : phone, ('address') : address, ('country') : country, ('state') : state, ('city') : city, 
			('zipCode') : zipCode])
	}
		
	public void registration(int index){
		WebUI.callTestCase(findTestCase('SubTestCase/Registration'), [('index') : index], FailureHandling.CONTINUE_ON_FAILURE)
	}
}
