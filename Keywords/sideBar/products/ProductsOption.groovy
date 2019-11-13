package sideBar.products

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class ProductsOption extends BasePage{

	private static final TestObject OPTION_PRODUCTS 	   = findTestObject('Object Repository/SideBar/ProductsOption/option_products')
	private static final TestObject SUBOPTION_ALL_PRODUCTS = findTestObject('Object Repository/SideBar/ProductsOption/suboption_all_products')
	private static final TestObject SUBOPTION_ADD_PRODUCT  = findTestObject('Object Repository/SideBar/ProductsOption/suboption_add_new_product')

	public void selectAllProductsOption(){
		WebUI.click(OPTION_PRODUCTS)
		WebUI.waitForElementClickable(SUBOPTION_ALL_PRODUCTS, 5)
		WebUI.click(SUBOPTION_ALL_PRODUCTS)
	}

	public void selectAddProductOption(){
		WebUI.click(OPTION_PRODUCTS)
		WebUI.waitForElementClickable(SUBOPTION_ADD_PRODUCT, 5)
		WebUI.click(SUBOPTION_ADD_PRODUCT)
	}
}
