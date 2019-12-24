package data

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory

import helper.Utils

public class ProductList{

	private static final String XPATH_PRODUCT = "//img[@class='c-product-card__img']"

	public static String getRandomProductIndex(){
		int productsLength = getNumberOfProducts()
		return Utils.getRandomNumber(productsLength)
	}

	public static int getNumberOfProducts(){
		List<WebElement> products = DriverFactory.getWebDriver().findElements(By.xpath(XPATH_PRODUCT))
		return products.size()
	}
}
