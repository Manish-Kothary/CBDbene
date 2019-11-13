package footer

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import base.BasePage

public class FooterSection extends BasePage{
	
	private static final TestObject LINK_AFFILIATE_PROGRAM = findTestObject('Object Repository/FooterSection/link_affiliate_program')
	private static final TestObject LINK_CONTACT_US		   = findTestObject('Object Repository/FooterSection/link_contact_us')
	
	public void clickLinkAffiliateProgram(){
		WebOp.scrollToBotom()
		WebUI.click(LINK_AFFILIATE_PROGRAM)
	}
	
	public void clickContactUs(){
		WebOp.scrollToBotom()
		WebUI.click(LINK_CONTACT_US)
	}
}
