package homePage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class AgeWarningPopup extends BasePage{
	
	private static final TestObject POPUP_WARNING = findTestObject('HomePage/AgeWarningPopup/button_enter')
	private static final TestObject ICON_CLOSE_POPUP = findTestObject('HomePage/AgeWarningPopup/icon_close_window')
	
	public void closeAgeWarningPopUp(){
		WebUI.waitForElementVisible(POPUP_WARNING, 3)
		WebUI.click(ICON_CLOSE_POPUP)
		WebOp.waitForElementNotPresent(ICON_CLOSE_POPUP)
	}
}
