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

editProduct.uploadImage(image_path)

editProduct.clickSubmitButton()

editProduct.validateSuccessfulUpdate()