package checkout

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
import com.kms.katalon.core.webui.common.EBrowser
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class PaymentMethodSection {
	
	private static final TestObject SPAN_PAY_WITH_CARD	  = findTestObject('Object Repository/Page_Ben  Checkout/b_Pay with card')
	private static final TestObject INPUT_CARD_NUMBER 	  = findTestObject('Object Repository/checkout/Page_Ben  Checkout/input_Card Number_cardNumber')
	private static final TestObject INPUT_EXPIRATION_DATE = findTestObject('Object Repository/checkout/Page_Ben  Checkout/input_Expiration Date_expDate')
	private static final TestObject INPUT_CVV_CODE		  = findTestObject('Object Repository/Page_Ben  Checkout/input_CVV Code_cvNumber')

	public void enterCardNumber(String cardNumber){
		WebUI.waitForElementVisible(INPUT_CARD_NUMBER, 10)
		WebUI.setText(INPUT_CARD_NUMBER, cardNumber)
	}
	
	public void enterExpirationDate(String expirationDate){
		WebUI.setText(INPUT_EXPIRATION_DATE, expirationDate)
	}
	
	public void enterCVVCode(String code){
		WebUI.setEncryptedText(INPUT_CVV_CODE, code)
	}
	
	public void selectCardOption(){
		WebUI.click(SPAN_PAY_WITH_CARD)
	}
	
	public void payWithCard(String cardNumber, String expirationDate, String code){
		WebUI.delay(2)
		selectCardOption()
		enterCardNumber(cardNumber)
		enterExpirationDate(expirationDate)
		enterCVVCode(code)
	}
}
