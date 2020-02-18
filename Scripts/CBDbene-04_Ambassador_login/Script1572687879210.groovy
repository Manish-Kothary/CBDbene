import ambasaddorLogin.AmbassadorLoginPage as AmbassadorLoginPage
import data.Password as Password
import homePage.HomePage as HomePage
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

PersonData personData = new PersonData()

//for (int i = 1; i < personData.getQuantity(); i++) {
for (int i = 1; i <= 10; i++) {
    WebUI.callTestCase(findTestCase('SubTestCase/Ambassador_Login'), [('index') : i], FailureHandling.CONTINUE_ON_FAILURE)
}


