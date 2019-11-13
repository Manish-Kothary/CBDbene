import createAccount.CreateAccountPage as CreateAccountPage
import data.Password as Password
import homePage.HomePage as HomePage
import loginPage.LoginPage as LoginPage
import main.Application as Application
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Application.start()

HomePage homePage = new HomePage()

homePage.mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

loginPage.clickCreateYourBeneAccount()

CreateAccountPage createAccount = new CreateAccountPage()

def password = Password.generate(lastName, zipCode)

createAccount.enterAccountInformation(firstName, lastName, email, phone, password)

def error_message = createAccount.getErrorMessageWrongEmail()

createAccount.clickRegisterButton()

homePage.mainHeader.validateAccountName(firstName)

createAccount.validateEmailNotTaken()