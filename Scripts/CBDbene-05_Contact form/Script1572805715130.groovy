import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import data.PersonData as PersonData
import homePage.HomePage
import main.Application as Application

Application.start()

PersonData personData = new PersonData()

//for (int i = 1; i < personData.getQuantity(); i++) {
for (int i = 50; i < 60; i++) {
    WebUI.callTestCase(findTestCase('SubTestCase/Contact_Form'), [('index') : i], FailureHandling.CONTINUE_ON_FAILURE)
}

