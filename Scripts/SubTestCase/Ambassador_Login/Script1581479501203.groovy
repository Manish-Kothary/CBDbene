import ambasaddorLogin.AmbassadorLoginPage
import data.Password
import data.Person
import data.PersonData
import homePage.HomePage

HomePage homePage = new HomePage()

PersonData personData = new PersonData()

Person person = personData.getPerson(index)

homePage.footerSection.clickLinkAffiliateProgram()

AmbassadorLoginPage ambassador = new AmbassadorLoginPage()

def password = Password.generate(person.getLastName(), person.getZipCode())

ambassador.login(person.getEmail(), password)

