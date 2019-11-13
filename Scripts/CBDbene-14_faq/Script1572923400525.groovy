import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import adminLogin.AdminLoginPage
import allProducts.AllProductsPage
import editProduct.EditProductPage
import main.Application
import sideBar.SideBarSection

Application.adminStart()

AdminLoginPage adminLogin = new AdminLoginPage()

adminLogin.encryptedLogin(email, password)

SideBarSection sideBar = new SideBarSection()

sideBar.getProductOption().selectAllProductsOption()	
		
AllProductsPage allProducts = new AllProductsPage()

allProducts.searchId(id)

allProducts.editFirstResult()

EditProductPage editProduct = new EditProductPage()

editProduct.setFaq0Title(faq_0_title)

editProduct.setFaq0Description(faq_0_description)

editProduct.clickAddMoreButton()

editProduct.setFaq1Title(faq_1_title)

editProduct.setFaq1Description(faq_1_description)

editProduct.clickCloneButton()

editProduct.setFaq2Title(faq_2_title)

editProduct.setFaq2Description(faq_2_description)

editProduct.clickSubmitButton()

editProduct.validateSuccessfulUpdate()