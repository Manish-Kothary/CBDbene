import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import ambasaddorLogin.AmbassadorLoginPage
import ambassadorApplication.AmbassadorApplicationPage
import data.Password
import homePage.HomePage
import main.Application

Application.start()

HomePage homePage = new HomePage()

homePage.footerSection.clickLinkAffiliateProgram()

AmbassadorLoginPage ambassador = new AmbassadorLoginPage()

ambassador.clickRegistrationLink()

AmbassadorApplicationPage ambassadorApplication = new AmbassadorApplicationPage()

def password = Password.generate(lastName, zipCode)

ambassadorApplication.enterData(firstName, lastName, email, phone, password, profession, website, instagram, facebook, zipCode, reason, network)
  
ambassadorApplication.clickRegisterButton()

ambassadorApplication.validateSuccessfulApplication()