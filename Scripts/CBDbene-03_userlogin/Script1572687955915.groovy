import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import data.Password
import homePage.HomePage as HomePage
import loginPage.LoginPage as LoginPage
import main.Application as Application

Application.start()

HomePage homePage = new HomePage()

homePage.mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

def password = Password.generate(lastName, zipCode)

loginPage.login(email, password)

homePage.mainHeader.validateAccountName(firstName)
