import checkout.CheckoutPage
import mainHeader.MainHeaderSection
import yourCart.YourCartPopup

MainHeaderSection mainHeader = new MainHeaderSection()

mainHeader.clickMyCart()

YourCartPopup yourCart = new YourCartPopup()

yourCart.clickCheckoutButton()

CheckoutPage checkout = new CheckoutPage()

//checkout.clickContinueAsGuestButton()

//checkout.billingAddress.displayAddressSection()

checkout.billingAddress.clickContinueToShoppingButton()

checkout.carrier.select(carrierOption)

checkout.carrier.clickContinueToShipping()

checkout.paymentMethod.payWithCard(cardNumber, firstName, expirationDate, cvv)
