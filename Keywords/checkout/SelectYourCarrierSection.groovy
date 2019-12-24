package checkout

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class SelectYourCarrierSection extends BasePage{
	
	private static final TestObject CHECKBOX_STANDARD = findTestObject('')
	private static final TestObject CHECKBOX_PRIORITY = findTestObject('Object Repository/checkout/Page_Ben  Checkout/span_6015 (Priority)_CheckIcon checked')
	private static final TestObject CHECKBOX_EXPRESS = findTestObject('')
	private static final TestObject BUTTON_CONTINUE_TO_SHOPPING = findTestObject('Object Repository/CheckoutPage/Shopping/button_continue_to_shopping')
	 
	public void selectStandardOption(){
		selectMethod("1")
	}
	
	public void selectPriorityOption(){
		selectMethod("2")
	}
	
	public void selectExpressOption(){
		selectMethod("3")
	}
	
	public void selectMethod(String methodIndex){
		TestObject shippingMethod = findTestObject('Object Repository/CheckoutPage/checkbox_shipping',[('index') : methodIndex])
		WebOp.visualizeElementAndClick(shippingMethod)
	}
	
	public void clickContinueToShipping(){
		WebUI.click(BUTTON_CONTINUE_TO_SHOPPING)
	}
	
	public void select(String carrier){
		WebUI.delay(2)
		switch (carrier){
			case "Standard":
				selectStandardOption()
				break
			case "Priority":
				selectPriorityOption()
				break
			case "Express":
				selectExpressOption()
				break
			default:
				selectStandardOption()
		}
	}
	
}
