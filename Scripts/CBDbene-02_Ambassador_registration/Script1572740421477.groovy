import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import data.PersonData as PersonData
import homePage.HomePage as HomePage
import main.Application as Application

Application.start()

HomePage homePage = new HomePage()

PersonData personData = new PersonData()

for (int i = 0; i < personData.getQuantity(); i++) {
//for (int i = 1; i < 10; i++) {
    WebUI.callTestCase(findTestCase('SubTestCase/Ambassador Registration'), [('index') : i], FailureHandling.CONTINUE_ON_FAILURE)
}


