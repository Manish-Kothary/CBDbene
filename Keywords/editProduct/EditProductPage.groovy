package editProduct

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class EditProductPage {
	
	private static final TestObject BUTTON_UPLOAD_IMAGE 	= findTestObject('Object Repository/CBDbene/cbd/Page_Edit Products/input_Section B Image_sectionbimage')
	private static final TestObject BUTTON_SUBMIT 	    	= findTestObject('CBDbene/Page_Edit Products/input_Publish_producteditsubmit btn btn-light')
	private static final TestObject TEXT_SUCCESSFUL_UPDATE  = findTestObject('Object Repository/EditProductPage/message_successful_edit')
	private static final TestObject INPUT_FAQ_TITLE_0 	    = findTestObject('CBDbene/Page_Edit Products/input_FAQ Title_faq0title')
	private static final TestObject INPUT_FAQ_DESCRIPTION_0 = findTestObject('CBDbene/Page_Edit Products/textarea_FAQ Descripiton_faq0description')
	private static final TestObject INPUT_FAQ_TITLE_1 	    = findTestObject('CBDbene/Page_Edit Products/input_FAQ Title 1_faq1title')
	private static final TestObject INPUT_FAQ_DESCRIPTION_1 = findTestObject('CBDbene/Page_Edit Products/textarea_FAQ Descripiton 1_faq1description')
	private static final TestObject INPUT_FAQ_TITLE_2 	    = findTestObject('CBDbene/Page_Edit Products/input_FAQ Title 2_faq2title')
	private static final TestObject INPUT_FAQ_DESCRIPTION_2 = findTestObject('CBDbene/Page_Edit Products/textarea_FAQ Descripiton 2_faq2description')
	private static final TestObject BUTTON_ADD_MORE			= findTestObject('CBDbene/Page_Edit Products/button_Add More')
	private static final TestObject BUTTON_CLONE			= findTestObject('CBDbene/Page_Edit Products/button_Clone')
	
	public void clickAddMoreButton(){
		if(!WebUI.waitForElementVisible(INPUT_FAQ_TITLE_1, 5)){
			WebUI.click(BUTTON_ADD_MORE)
		}
	}
	
	public void clickCloneButton(){
		if (WebUI.waitForElementVisible(BUTTON_CLONE, 3)){
			WebUI.click(BUTTON_CLONE)
		}
	}
	
	public void uploadImage(String image){
		WebUI.uploadFile(BUTTON_UPLOAD_IMAGE, image)
	}
	
	public void clickSubmitButton(){
		WebUI.click(BUTTON_SUBMIT)
	}
	
	public void setFaq0Title(String title){
		WebUI.setText(INPUT_FAQ_TITLE_0, title)
	}
	
	public void setFaq0Description(String description){
		WebUI.setText(INPUT_FAQ_DESCRIPTION_0, description)
	}
	
	public void setFaq1Title(String title){
		WebUI.setText(INPUT_FAQ_TITLE_1, title)
	}
	
	public void setFaq1Description(String description){
		WebUI.setText(INPUT_FAQ_DESCRIPTION_1, description)
	}
	
	public void setFaq2Title(String title){
		WebUI.setText(INPUT_FAQ_TITLE_2, title)
	}
	
	public void setFaq2Description(String description){
		WebUI.setText(INPUT_FAQ_DESCRIPTION_2, description)
	}
	
	public boolean validateSuccessfulUpdate(){
		Assert.assertTrue("Edit failed, 'Product Saved Successfully' message not found", WebUI.waitForElementVisible(TEXT_SUCCESSFUL_UPDATE, 10))
		WebUI.takeScreenshot()
	}
}
