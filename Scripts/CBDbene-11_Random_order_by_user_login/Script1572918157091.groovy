import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import homePage.HomePage
import loginPage.LoginPage
import main.Application
import operation.UserOperation

Application.start()

HomePage homePage = new HomePage()

homePage.mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

loginPage.login(loginEmail,password)

UserOperation userOperation = new UserOperation()

userOperation.addProductToMyCart(1)

userOperation.checkout(firstName, lastName, email, phone, address, country, state, city, zipCode)
