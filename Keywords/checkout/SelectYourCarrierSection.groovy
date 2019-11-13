package checkout

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class SelectYourCarrierSection extends BasePage{
	
	private static final TestObject CHECKBOX_STANDARD = findTestObject('')
	private static final TestObject CHECKBOX_PRIORITY = findTestObject('Object Repository/checkout/Page_Ben  Checkout/span_6015 (Priority)_CheckIcon checked')
	private static final TestObject CHECKBOX_EXPRESS = findTestObject('')
	
	public void selectStandardOption(){
		WebUI.click(CHECKBOX_STANDARD)
	}
	
	public void selectPriorityOption(){
		WebUI.delay(2)
		WebUI.click(CHECKBOX_PRIORITY)
	}
	
	public void selectExpressOption(){
		WebUI.click(CHECKBOX_EXPRESS)
	}
	
	public void select(String carrier){
		WebUI.waitForElementVisible(CHECKBOX_PRIORITY, 90)
		WebOp.scrollToElement(CHECKBOX_PRIORITY)
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
