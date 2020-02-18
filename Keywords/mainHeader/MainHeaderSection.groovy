
package mainHeader

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class MainHeaderSection extends BasePage{

	private static final TestObject BUTTON_LOGIN 	  = findTestObject('MainHeaderSection/button_login')
	private static final TestObject BUTTON_MY_ACCOUNT = findTestObject('MainHeaderSection/button_my_account')
	private static final TestObject BUTTON_MY_CART	  = findTestObject('MainHeaderSection/button_my_cart')
	private static final TestObject OPTION_ACCOUNT	  = findTestObject('MainHeaderSection/text_hi_my_account')
	private static final TestObject OPTION_LOGOUT	  = findTestObject('MainHeaderSection/option_logout')
	private static final TestObject BUTTON_LOGOUT_ACCEPT = findTestObject('MainHeaderSection/button_accept_logout')
	private static final TestObject LINK_SHOP		  = findTestObject('MainHeaderSection/link_shop')
	
	public void clickLoginButton(){
		topClick(BUTTON_LOGIN)
		WebUI.delay(1)
	}

	public void clickButtonMyAccount(){
		topClick(BUTTON_MY_ACCOUNT)
	}

	public void topClick(TestObject testObject){
		WebOp.scrollToTop()
		WebOp.waitForElementVisible(testObject)
		WebUI.delay(1)
		WebUI.click(testObject)
	}

	public void selectProductCategory(String categoryIndex){
		TestObject category = findTestObject('MainHeaderSection/tab_category',[('category') : categoryIndex])
		WebUI.click(category)
	}

	public void clickMyCart(){
		topClick(BUTTON_MY_CART)
	}

	public boolean findMyAccountName(String name){
		TestObject myAccountName = findTestObject('Object Repository/MainHeaderSection/text_my_account',[('name') : name])
		return WebUI.waitForElementVisible(myAccountName,60,FailureHandling.CONTINUE_ON_FAILURE)
	}

	public boolean validateAccountName(String name){
		findMyAccountName(name.trim())
		return WebUI.waitForElementVisible(OPTION_ACCOUNT, 5)
	}
	
	public void clickShop(){
		topClick(LINK_SHOP)
		WebUI.delay(1)
	}
	
	public void clickLogoutOption(){
		WebUI.mouseOver(BUTTON_LOGIN)
		WebUI.delay(1)
		WebUI.click(OPTION_LOGOUT)	
		WebUI.delay(1)
	}
}
