import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import adminLogin.AdminLoginPage
import allProducts.AllProductsPage
import data.Index
import editProduct.EditProductPage
import main.Application
import reports.ReportForProductUpdate
import sideBar.SideBarSection

Index.setRowValue(index)

Application.adminStart()

AdminLoginPage adminLogin = new AdminLoginPage()

adminLogin.encryptedLogin(adminEmail, password)

SideBarSection sideBar = new SideBarSection()

sideBar.getProductOption().selectAllProductsOption()	
		
AllProductsPage allProducts = new AllProductsPage()

allProducts.searchId(id)

allProducts.editFirstResult()

EditProductPage editProduct = new EditProductPage()

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Edit Serial number_productid'), id)

String dbId = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Edit Serial number_productid'),"value")

ReportForProductUpdate report = new ReportForProductUpdate()

report.evaluateValue(dbId, id, "serial")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input__producttitle'), producttitle)

WebUI.click(findTestObject('Object Repository/CBDbene/Page_Edit Products/a_Shipping'))

String db_shipping_length = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Dimensions (cm)__length'),"value")

report.evaluateValue(db_shipping_length, shipping_length, "shipping_length")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Dimensions (cm)__length'), shipping_length)

String db_shipping_width = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Dimensions (cm)__width'),"value")

report.evaluateValue(db_shipping_width, shipping_width, "shipping_width")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Dimensions (cm)__width'), shipping_width)

String db_shipping_height = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Dimensions (cm)__height'),"value")

report.evaluateValue(db_shipping_height, shipping_height, "shipping_height")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Dimensions (cm)__height'), shipping_height)

String db_volume = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Volume_volume'),"value")

report.evaluateValue(db_volume, volume, "volume")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Volume_volume'), volume)

String db_weight = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Weight (oz)_weight'),"value")

report.evaluateValue(db_weight, weight, "weight")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Weight (oz)_weight'), weight)

WebUI.click(findTestObject('Object Repository/CBDbene/Page_Edit Products/a_Attributes'))

WebUI.click(findTestObject('Object Repository/CBDbene/Page_Edit Products/a_Attributes'))

WebUI.click(findTestObject('Object Repository/CBDbene/Page_Edit Products/a_General'))

String db_totalcbdmg = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Total CBD (mg)_totalcbdmg'),"value")

report.evaluateValue(db_totalcbdmg, totalcbdmg, "weight")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Total CBD (mg)_totalcbdmg'), totalcbdmg)

String db_servings = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Servings_servings'),"value")

report.evaluateValue(db_servings, servings, "servings")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Servings_servings'), servings)

String db_cbdperunitmg = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_CBD Per Unit mg_cbdperunitmg'),"value")

report.evaluateValue(db_cbdperunitmg, cbdperunitmg, "servings")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_CBD Per Unit mg_cbdperunitmg'), cbdperunitmg)

String db_servingsize = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Serving Size_servingsize'),"value")

report.evaluateValue(db_servingsize, servingsize, "servingsize")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Serving Size_servingsize'), servingsize)

String db_barcode = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Barcode_barcode'),"value")

report.evaluateValue(db_barcode, barcode, "barcode")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Barcode_barcode'), barcode)
/*
String db_visibilitytype = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/select_Show                                                Hide'),"value")

report.evaluateValue(db_visibilitytype, visibilitytype, "visibilitytype")
*/
	//WebUI.click(findTestObject('Object Repository/CBDbene/Page_Edit Products/Visibility'))
	if ( visibilitytype == true)
//(WebUI.verifyElementPresent(findTestObject('Object Repository/CBDbene/Page_Edit Products/Visibility').findTestData('registration_details').getValue(15, rowNum)) == true) {
	{
			WebUI.selectOptionByValue(findTestObject('Object Repository/CBDbene/Page_Edit Products/select_Show                                                Hide'),
				'false', true)
				
			}
	 else {
		 WebUI.selectOptionByValue(findTestObject('Object Repository/CBDbene/Page_Edit Products/select_Show                                                Hide'),
			 'true', true)
	}
	
	// WebUI.click(findTestObject('CBDbene/Page_Edit Products/select_Normal
	if ( featured == true)
	//(WebUI.verifyElementPresent(findTestObject('Object Repository/CBDbene/Page_Edit Products/normal'), findTestData('registration_details').getValue(14, rowNum)) == true) {
	{
			
			WebUI.selectOptionByValue(findTestObject('Object Repository/CBDbene/Page_Edit Products/select_Normal                                                Featured'),
				'false', true)
				
	}
	 else {
		WebUI.selectOptionByValue(findTestObject('Object Repository/CBDbene/Page_Edit Products/select_Normal                                                Featured'),
					'true', true)
	}
	 String db_dsaleprice = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input__sale_price'),"value")
	 
	 report.evaluateValue(db_dsaleprice, dsaleprice, "dsaleprice")
		  
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input__sale_price'), dsaleprice)
	 
	 WebUI.click(findTestObject('Object Repository/CBDbene/Page_Edit Products/a_Inventory'))
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Stock quantity_stock'), unit)
	 
	 String db_sdescription = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/25 mg CBD meets'),"value")
	 
	 report.evaluateValue(db_sdescription, sdescription, "dsaleprice")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/25 mg CBD meets'), sdescription)
	 
	 String db_description = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/CBD and Curcumin in wate'),"value")
	 
	 report.evaluateValue(db_description, description, "description")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/CBD and Curcumin in wate'), description)
	 
	 String db_storage = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Storage_storage'),"value")
	 
	 report.evaluateValue(db_storage, storage, "storage")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Storage_storage'), storage)
	 
	 String db_warning = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Warning_warning'),"value")
	 
	 report.evaluateValue(db_warning, warning, "warning")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Warning_warning'), warning)
	 
	 String db_indication = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Indication_indication'),"value")
	 
	 report.evaluateValue(db_indication, indication, "indication")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Indication_indication'),indication)
	 
	 String db_direction = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Direction_direction'),"value")
	 
	 report.evaluateValue(db_direction, direction, "direction")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Direction_direction'), direction)
	 
	 String db_warranty = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Warranty_warranty'),"value")
	 
	 report.evaluateValue(db_warranty, warranty, "warranty")
	 
	 WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Warranty_warranty'), warranty)
	 
String db_attributecontent_0_title = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute One Title_page_attribute0title'),"value")
	 
report.evaluateValue(db_attributecontent_0_title, attributecontent_0_title, "attributecontent_0_title")
	
WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute One Title_page_attribute0title'), 
        attributecontent_0_title)

String db_attributecontent_0_description = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/A safe start to a CBD exper'),"value")

report.evaluateValue(db_attributecontent_0_description, attributecontent_0_description, "attributecontent_0_description")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/A safe start to a CBD exper'), attributecontent_0_description)

String db_attributecontent_1_title = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute Two Title_page_attribute1title'),"value")

report.evaluateValue(db_attributecontent_1_title, attributecontent_1_title, "attributecontent_1_title")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute Two Title_page_attribute1title'), 
        attributecontent_1_title)

String db_attributecontent_1_description = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/Take one or two softgel ca'),"value")

report.evaluateValue(db_attributecontent_1_description, attributecontent_1_description, "attributecontent_1_description")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/Take one or two softgel ca'), attributecontent_1_description)

String db_attributecontent_2_title = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute Three Title_page_attribute2title'),"value")

report.evaluateValue(db_attributecontent_2_title, attributecontent_2_title, "attributecontent_2_title")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute Three Title_page_attribute2title'), 
        attributecontent_2_title)

String db_attributecontent_2_description = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/Nanoemulsion droplets of CBD'),"value")

report.evaluateValue(db_attributecontent_2_description, attributecontent_2_description, "attributecontent_2_description")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/Nanoemulsion droplets of CBD'), attributecontent_2_description)

String db_attributecontent_3_title = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute Four Title_page_attribute3title'),"value")

report.evaluateValue(db_attributecontent_3_title, attributecontent_3_title, "attributecontent_3_title")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute Four Title_page_attribute3title'), 
        attributecontent_3_title)

String db_attributecontent_3_description = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/Both turmeric and CBD'),"value")

report.evaluateValue(db_attributecontent_3_description, attributecontent_3_description, "attributecontent_3_description")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/Both turmeric and CBD'), attributecontent_3_description)

String db_attributecontent_4_title = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute five Title_page_attribute4title'),"value")

report.evaluateValue(db_attributecontent_4_title, attributecontent_4_title, "attributecontent_4_title")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/input_Attribute five Title_page_attribute4title'), 
        attributecontent_4_title)

String db_attributecontent_4_description = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/textarea_00 THC'),"value")

report.evaluateValue(db_attributecontent_4_description, attributecontent_4_description, "attributecontent_4_description")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/textarea_00 THC'), attributecontent_4_description)

String db_keyingredients = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/Organically grown hemp extra'),"value")

report.evaluateValue(db_keyingredients , keyingredients, "keyingredients")

WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/Organically grown hemp extra'), keyingredients)
	
String db_allingredients = WebUI.getAttribute(findTestObject('Object Repository/CBDbene/Page_Edit Products/Organically grown hemp extra'),"value")
	
report.evaluateValue(db_allingredients , allingredients, "allingredients")
		
WebUI.setText(findTestObject('Object Repository/CBDbene/Page_Edit Products/Organically grown hemp extra'), allingredients)

WebUI.click(findTestObject('CBDbene/Page_Edit Products/input_Publish_producteditsubmit btn btn-light'))

editProduct.clickSubmitButton()

editProduct.validateSuccessfulUpdate()