import contactUs.ContactUsPage
import homePage.HomePage
import main.Application

Application.start()

HomePage homePage = new HomePage()

homePage.footerSection.clickContactUs()

ContactUsPage contactUs = new ContactUsPage()

contactUs.fillForm(name, email, message)

contactUs.clickSendEmailButton()