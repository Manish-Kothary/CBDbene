import homePage.HomePage
import loginPage.LoginPage
import main.Application
import myOrder.MyOrderPage

Application.start()

HomePage homePage = new HomePage()

homePage.mainHeader.clickLoginButton()

LoginPage loginPage = new LoginPage()

loginPage.login(email, password)

homePage.mainHeader.clickButtonMyAccount()

MyOrderPage myOrder = new MyOrderPage()

//TODO: if no order, create one

myOrder.clickFirstWriteAProductReview()

myOrder.reviewPopup.chooseProductCBDIsolata500mg()

myOrder.reviewPopup.rateProduct(overallRating, effectiveness, quality, valueForMoney)

myOrder.reviewPopup.addHeadline(headline)

myOrder.reviewPopup.writeReview(review)

myOrder.reviewPopup.clickButtonSubmit()