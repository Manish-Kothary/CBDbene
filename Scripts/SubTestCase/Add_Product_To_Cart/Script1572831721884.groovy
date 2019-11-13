import checkout.CheckoutPage
import data.Category
import data.ProductList
import mainHeader.MainHeaderSection
import product.ProductPage
import productList.ProductListPage

MainHeaderSection mainHeader = new MainHeaderSection()

mainHeader.selectProductCategory(Category.getRandomCategoryNumber())

ProductListPage productList = new ProductListPage()

productList.selectProduct(ProductList.getRandomProductIndex())

ProductPage product = new ProductPage()

product.selectFlavor(flavor)

product.clickAddToCartButton()

product.yourCartPopUp().closePopup()

CheckoutPage checkout = new CheckoutPage()

checkout.clickContinueShopping()