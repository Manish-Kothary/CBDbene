package data

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

public class Person {
	
	private String firstName, lastName, address1, address2, city, state, country, zipCode, phone, email
	
	public Person(_firstName,_lastName,_address1,_address2,_city,_state,_zipCode,_phone,_email){
		firstName = _firstName
		lastName = _lastName
		address1 = _address1
		address2 = _address2
		city = _city
		state = _state
		country = "USA"
		zipCode = _zipCode
		phone = _phone
		email = _email
	}
	
	public String getFirstName(){
		return firstName
	}
	
	public String getLastName(){
		return lastName
	}
	
	public String getAddress1(){
		return address1
	}
	
	public String getAddress2(){
		return address2
	}
	
	public String getCity(){
		return city
	}
	
	public String getState(){
		return state
	}
	
	public String getCountry(){
		return country
	}
	
	public String getZipCode(){
		return zipCode
	}
	
	public String getPhone(){
		return phone
	}
	
	public String getEmail(){
		return email
	}
	
}
