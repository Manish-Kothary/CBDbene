package productList

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import base.BasePage
import yourCart.YourCartPopup

public class ProductListPage extends BasePage{
		
	public void selectProduct(String productIndex){
		TestObject product = findTestObject('ProductListPage/picture_product',[('index') : productIndex])
		WebOp.visualizeElementAndClick(product)
	}
}
