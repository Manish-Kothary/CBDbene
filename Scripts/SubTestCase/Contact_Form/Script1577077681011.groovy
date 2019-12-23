import contactUs.ContactUsPage
import data.Person
import data.PersonData
import data.Topic
import footer.FooterSection
import main.Application

Application.start()

FooterSection footerSection = new FooterSection()

footerSection.clickContactUs()

ContactUsPage contactUs = new ContactUsPage()

PersonData personData = new PersonData()

Person person = personData.getPerson(index)

int topic = Topic.getRandomTopic()

contactUs.selectTopic(topic)

contactUs.fillForm(person.getFirstName(), person.getEmail(), message)

contactUs.clickSendEmailButton()