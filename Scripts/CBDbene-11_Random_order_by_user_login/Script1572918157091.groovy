import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import data.Person
import data.PersonData
import homePage.HomePage as HomePage
import main.Application as Application
import operation.UserOperation as UserOperation

Application.start()

HomePage homePage = new HomePage()

WebUI.callTestCase(findTestCase('SubTestCase/Login'), [('index') : 1], FailureHandling.CONTINUE_ON_FAILURE)

UserOperation userOperation = new UserOperation()

PersonData personData = new PersonData()

Person person = personData.getRandomPerson()

userOperation.addProductToMyCart(1)

userOperation.checkout(person)
