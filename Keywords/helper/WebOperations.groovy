package helper

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class WebOperations {

	public boolean verifyElementVisible(TestObject testObject){
		return WebUI.verifyElementVisible(testObject, FailureHandling.OPTIONAL)
	}

	public boolean verifyElementPresent(TestObject testObject){
		return WebUI.verifyElementPresent(testObject, GlobalVariable.DEFAULT_WAIT, FailureHandling.OPTIONAL)
	}

	public boolean waitForElementVisible(TestObject testObject){
		return WebUI.waitForElementVisible(testObject, GlobalVariable.DEFAULT_WAIT)
	}

	public boolean waitForElementNotVisible(TestObject testObject){
		return WebUI.waitForElementNotVisible(testObject, GlobalVariable.DEFAULT_WAIT)
	}
	public boolean waitForElementPresent(TestObject testObject){
		return WebUI.waitForElementPresent(testObject, GlobalVariable.DEFAULT_WAIT)
	}

	public boolean waitForElementNotPresent(TestObject testObject){
		return WebUI.waitForElementNotPresent(testObject, GlobalVariable.DEFAULT_WAIT)
	}

	public boolean waitForElementClickable(TestObject testObject){
		return WebUI.waitForElementClickable(testObject, GlobalVariable.DEFAULT_WAIT)
	}

	public void waitForElementNotHasAttribute(TestObject testObject, String attributeName){
		WebUI.waitForElementNotHasAttribute(testObject, attributeName, GlobalVariable.DEFAULT_WAIT)
	}

	public void waitForElementHasAttribute(TestObject testObject, String attributeName){
		WebUI.waitForElementHasAttribute(testObject, attributeName, GlobalVariable.DEFAULT_WAIT)
	}

	public void selectOptionByLabel(TestObject testObject, String label){
		WebUI.selectOptionByLabel(testObject, label, false)
	}

	public void clearText(TestObject testObject){
		WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, "a"))
		WebUI.sendKeys(testObject, Keys.DELETE.toString())
	}

	public void setText(TestObject testObject, String text){
		WebUI.setText(testObject, text)
		WebUI.sendKeys(testObject, Keys.ARROW_DOWN.toString())
		WebUI.sendKeys(testObject, Keys.ENTER.toString())
	}
	
	public void sendKeys(TestObject testObject, String text){
		WebUI.sendKeys(testObject, text)
		WebUI.delay(1)
		WebUI.sendKeys(testObject, Keys.ARROW_DOWN.toString())
		WebUI.delay(1)
		WebUI.sendKeys(testObject, Keys.ENTER.toString())
		WebUI.delay(1)
	}

	public void scrollToTop(){
		WebUI.scrollToPosition(0, 0)
	}
	
	public void scrollToBotom(){
		WebUI.scrollToPosition(9999999, 9999999)
		WebUI.delay(1)
	}

	public void scrollToElement(TestObject testObject){
		WebUI.scrollToElement(testObject, GlobalVariable.DEFAULT_WAIT)
	}
	
	public boolean verifyElementViewPort(TestObject testObject){
		return WebUI.verifyElementInViewport(testObject, GlobalVariable.DEFAULT_WAIT)
	}
	
	public void visualizeElementAndClick(TestObject testObject){
		scrollToElement(testObject)
		WebUI.delay(2)
		waitForElementVisible(testObject)
		waitForElementClickable(testObject)
		WebUI.click(testObject)
	}
}
