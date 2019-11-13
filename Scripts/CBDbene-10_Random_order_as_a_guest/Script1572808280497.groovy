import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import homePage.HomePage as HomePage
import main.Application as Application
import operation.UserOperation

Application.start()

HomePage homePage = new HomePage()

UserOperation userOperation = new UserOperation()

userOperation.addProductToMyCart(5)

userOperation.checkout(firstName, lastName, email, phone, address, country, state, city, zipCode)