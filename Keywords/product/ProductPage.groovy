package product

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage
import yourCart.YourCartPopup

public class ProductPage extends BasePage{

	private static final TestObject BUTTON_ADD_TO_CART = findTestObject('Object Repository/ProductPage/button_add_to_cart')
	private static final TestObject SELECT_FLAVOR = findTestObject('Object Repository/ProductPage/select_flavor')
	private YourCartPopup yourCart = new YourCartPopup()
	
	public void clickAddToCartButton(){
		WebOp.visualizeElementAndClick(BUTTON_ADD_TO_CART)
	}
	
	public void selectFlavor(String flavor){
		if(WebUI.waitForElementVisible(SELECT_FLAVOR, 3)){
			WebOp.sendKeys(SELECT_FLAVOR, flavor)
		}
	}
	
	public YourCartPopup yourCartPopUp(){
		return yourCart
	}
	
}
