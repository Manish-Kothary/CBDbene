package main
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Application {

	private static final String URL = "https://cbdbene.com/"
	private static final String ADMIN_URL = "https://admin.cbdbene.com/users/login"


	public static void start(){
		WebUI.navigateToUrl(URL)
	}

	public static void adminStart(){
		WebUI.navigateToUrl(ADMIN_URL)
	}

	private static void openBrowser(String url){
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
	}
}
