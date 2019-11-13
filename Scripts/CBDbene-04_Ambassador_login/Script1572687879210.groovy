import data.Password
import homePage.HomePage
import loginPage.LoginPage
import main.Application

Application.start()

HomePage homePage = new HomePage()

homePage.footerSection.clickLinkAffiliateProgram()

LoginPage loginPage = new LoginPage()

def password = Password.generate(lastName, zipCode)

loginPage.login(email, password)

homePage.mainHeader.validateAccountName(firstName)