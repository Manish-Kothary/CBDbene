import com.kms.katalon.core.util.KeywordUtil

import createAccount.CreateAccountPage as CreateAccountPage
import data.Password as Password
import data.Person
import data.PersonData
import loginPage.LoginPage as LoginPage
import mainHeader.MainHeaderSection

PersonData personData = new PersonData()
	
Person person = personData.getPerson(index)

MainHeaderSection mainHeader = new MainHeaderSection()

mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

loginPage.clickCreateYourBeneAccount()

CreateAccountPage createAccount = new CreateAccountPage()

def password = Password.generate(person.getLastName(), person.getZipCode())

createAccount.enterAccountInformation(person, password)

createAccount.clickRegisterButton()

createAccount.validateEmailNotTaken()

if(mainHeader.validateAccountName(person.getFirstName())){
	mainHeader.clickLogout()
}else{
	KeywordUtil.markFailed("Registration not done.")
}