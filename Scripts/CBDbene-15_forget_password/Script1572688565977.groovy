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

LoginPage loginPage = new LoginPage()

loginPage.clickLinkForgotPassword()

ForgotYourPasswordPage forgotYourPassword = new ForgotYourPasswordPage()

forgotYourPassword.enterEmail(email)

forgotYourPassword.clickResetButton()
