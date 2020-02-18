import com.kms.katalon.core.util.KeywordUtil

import data.Password
import data.Person
import data.PersonData
import helper.Utils
import loginPage.LoginPage
import mainHeader.MainHeaderSection

Utils.setTimeOut(index)

PersonData personData = new PersonData()

Person person = personData.getPerson(index)

MainHeaderSection mainHeader = new MainHeaderSection()

mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

def password = Password.generate(person.getLastName(), person.getZipCode())

loginPage.login(person.getEmail(), password)


if(mainHeader.validateAccountName(person.getFirstName())){
	mainHeader.clickLogoutOption()
}
else{
	KeywordUtil.markWarning("Error. Website Response took too long.")
}
	