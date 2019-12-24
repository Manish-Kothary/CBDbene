import data.Person
import data.PersonData
import homePage.HomePage as HomePage
import main.Application as Application
import operation.UserOperation

Application.start()

HomePage homePage = new HomePage()

UserOperation userOperation = new UserOperation()

PersonData personData = new PersonData()

Person person = personData.getRandomPerson()

userOperation.addProductToMyCart(1)

userOperation.checkout(person)
//userOperation.checkout(firstName, lastName, email, phone, address, country, state, city, zipCode)