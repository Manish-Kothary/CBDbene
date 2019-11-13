package homePage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class AgeWarningPopup extends BasePage{
	
	private static final TestObject BUTTON_ENTER = findTestObject('HomePage/AgeWarningPopup/button_enter')
	
	public void clickEnterButton(){
		WebUI.click(BUTTON_ENTER)
		WebOp.waitForElementNotPresent(BUTTON_ENTER)
	}
}
