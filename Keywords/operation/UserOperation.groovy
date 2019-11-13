package operation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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
