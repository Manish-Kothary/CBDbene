import ambasaddorLogin.AmbassadorLoginPage
import ambassadorApplication.AmbassadorApplicationPage
import data.Password
import data.Person
import data.PersonData
import footer.FooterSection

PersonData personData = new PersonData()

Person person = personData.getPerson(index)

FooterSection footerSection = new FooterSection()

footerSection.clickLinkAffiliateProgram()

AmbassadorLoginPage ambassador = new AmbassadorLoginPage()

ambassador.clickRegistrationLink()

AmbassadorApplicationPage ambassadorApplication = new AmbassadorApplicationPage()

def password = Password.generate(person.getLastName(), person.getZipCode())

ambassadorApplication.enterData(person, password, profession, website, instagram, facebook, reason, network)
  
ambassadorApplication.clickRegisterButton()

ambassadorApplication.validateEmailNotTaken()

ambassadorApplication.validateSuccessfulApplication()