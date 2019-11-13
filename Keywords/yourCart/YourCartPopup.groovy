package yourCart

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class YourCartPopup extends BasePage{

	private static final TestObject BUTTON_CHECKOUT = findTestObject('Object Repository/YourCartPopUp/button_checkout')
	private static final TestObject BUTTON_CLOSE    = findTestObject('Object Repository/YourCartPopUp/button_checkout')
	
	public void clickCheckoutButton(){
		WebOp.waitForElementVisible(BUTTON_CHECKOUT)
		WebOp.waitForElementClickable(BUTTON_CHECKOUT)
		WebUI.click(BUTTON_CHECKOUT)
	}
	
	public void closePopup(){
		WebUI.delay(2)
		WebUI.click(BUTTON_CLOSE)
		WebUI.delay(1)
	}
}
