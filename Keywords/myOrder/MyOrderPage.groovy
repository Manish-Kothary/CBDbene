package myOrder
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage
import review.ReviewPopup

public class MyOrderPage extends BasePage{

	private static final TestObject LINK_WRITE_A_PRODUCT_REVIEW = findTestObject('MyOrderPage/link_write_a_product_review')
	private ReviewPopup reviewPopup = new ReviewPopup()
	
	//TODO: Create a Generic Write a Product Review
	public void clickWriteAProductReview(){
		
	}
	
	public void clickFirstWriteAProductReview(){
		WebUI.click(LINK_WRITE_A_PRODUCT_REVIEW)
	}
}
