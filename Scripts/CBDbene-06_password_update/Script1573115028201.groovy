import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import forgotYourPassword.ForgotYourPasswordPage
import homePage.HomePage
import loginPage.LoginPage
import main.Application

Application.start()

HomePage homePage = new HomePage()

homePage.mainHeader.clickLoginButton()

LoginPage login = new LoginPage()

login.clickLinkForgotPassword()

ForgotYourPasswordPage forgorYourPassword = new ForgotYourPasswordPage()

forgorYourPassword.resetEmail(email)
