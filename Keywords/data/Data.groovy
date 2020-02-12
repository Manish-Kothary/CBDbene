package data

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory

public class Data {

	protected List<WebElement> getElementsByXpath(String xpath){
		return DriverFactory.getWebDriver().findElements(By.xpath(xpath))
	}

	protected List<String> getTextsByXpath(String xpath){
		return getElementsByXpath(xpath).collect {it.getText()}
	}
}
