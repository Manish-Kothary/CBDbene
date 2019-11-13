import checkout.CheckoutPage
import homePage.HomePage
import loginPage.LoginPage
import main.Application
import mainHeader.MainHeaderSection
import operation.UserOperation
import yourCart.YourCartPopup

Application.start()

HomePage homePage = new HomePage()

homePage.mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

loginPage.encryptedLogin(email, password)

UserOperation userOperation = new UserOperation()

userOperation.addProductToMyCart(5)

MainHeaderSection mainHeader = new MainHeaderSection()

mainHeader.clickMyCart()

YourCartPopup yourCart = new YourCartPopup()

yourCart.clickCheckoutButton()

CheckoutPage checkout = new CheckoutPage()

checkout.login(email, password)

checkout.clickSignMeUpForNewsCheckBox()

checkout.clickPlaceOrderButton()

checkout.validateSuccessfulOrder()
