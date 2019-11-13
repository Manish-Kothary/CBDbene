package allProducts

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import base.BasePage

public class AllProductsPage extends BasePage{
	
	private static final TestObject INPUT_SEARCH  = findTestObject('CBDbene/Page_All Products/input')
	private static final TestObject BUTTON_EDIT_1 = findTestObject('CBDbene/Page_All Products/i_CBD Curcumin Gel Capsules_fa fa-pencil-square-o')
	
	public void searchId(String id){
		WebUI.setText(INPUT_SEARCH, id)
	}
	
	public void editFirstResult(){
		WebUI.click(BUTTON_EDIT_1)
	}
}
