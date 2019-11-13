import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import data.Links
import helper.Screenshot
import homePage.HomePage
import main.Application

Application.start()

HomePage homePage = new HomePage()
Links links = new Links()
Screenshot screenshot = new Screenshot()

for (int i = 1; i <= links.getQuantity() ; i++){
	WebUI.navigateToUrl(links.getLink(i))
	screenshot.takeScreenshot(links.getName(i))
}