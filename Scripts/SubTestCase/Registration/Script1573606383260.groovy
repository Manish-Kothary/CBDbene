import data.Password as Password
import data.Person
import data.PersonData
import loginPage.LoginPage as LoginPage
import main.Application
import mainHeader.MainHeaderSection

Application.start()

PersonData personData = new PersonData()
	
Person person = personData.getPerson(index)

MainHeaderSection mainHeader = new MainHeaderSection()

mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

def password = Password.generate(person.getLastName(), person.getZipCode())

loginPage.clickRegisterLink()

loginPage.enterEmail(person.getEmail())

loginPage.enterPassword(password)

loginPage.clickRegisterButton()

if (!loginPage.accountAlreadyRegistered()){
	mainHeader.clickLogoutOption()
}