package checkout

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class CheckoutPage extends BasePage{

	private static final TestObject BUTTON_CONTINUE_AS_GUEST = findTestObject('Object Repository/CBDbene/1/Page_Ben  Checkout/button_Continue as Guest')
	private BillingAddressSection billingAddress = new BillingAddressSection()
	private SelectYourCarrierSection carrier = new SelectYourCarrierSection()
	private PaymentMethodSection paymentMethod = new PaymentMethodSection()
	private static final TestObject CHECKBOX_ME_UP_NEWS = findTestObject('Object Repository/new/Page_Ben  Checkout/span_5408_CheckIcon')
	private static final TestObject BUTTON_PLACE_ORDER = findTestObject('Object Repository/checkout/Page_Ben  Checkout/button_Place Order')
	private static final TestObject TITLE_SUCCESSFUL_ORDER = findTestObject('Object Repository/checkout/Page_Ben/h3_Thank you for shopping with us')
	private static final TestObject LINK_CONTINUE_SHOPPING = findTestObject('Object Repository/CheckoutPage/link_continue_shopping')
	private static final TestObject INPUT_EMAIL = findTestObject('Object Repository/CheckoutPage/input_email')
	private static final TestObject INPUT_PASSWORD = findTestObject('Object Repository/CheckoutPage/input_password')
	private static final TestObject BUTTON_SIGN_IN_TO_CHECKOUT= findTestObject('Object Repository/CheckoutPage/button_sign_in_checkout')
	
	public void clickContinueAsGuestButton(){
		WebUI.click(BUTTON_CONTINUE_AS_GUEST)
	}
	
	public void login(String email, String encryptedPassword){
		WebUI.setText(INPUT_EMAIL, email)
		WebUI.setEncryptedText(INPUT_PASSWORD, encryptedPassword)
		WebUI.click(BUTTON_SIGN_IN_TO_CHECKOUT)
		WebUI.delay(5)
	}
	
	public void clickContinueShopping(){
		WebUI.click(LINK_CONTINUE_SHOPPING)
		WebUI.delay(2)
	}
	
	public void clickSignMeUpForNewsCheckBox(){
		WebOp.visualizeElementAndClick(CHECKBOX_ME_UP_NEWS)
	}
	
	public void clickPlaceOrderButton(){
		WebOp.visualizeElementAndClick(BUTTON_PLACE_ORDER)
	}
	
	public void validateSuccessfulOrder(){
		Assert.assertTrue("Successful Order Message not found", WebOp.waitForElementVisible(TITLE_SUCCESSFUL_ORDER))
	}
}
