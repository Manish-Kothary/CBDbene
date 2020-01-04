package helper

import java.text.SimpleDateFormat

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Screenshot {

	private static final String PROJECT_DIRECTORY = RunConfiguration.getProjectDir() + "/"
	private static final String SCREENSHOTS_DIRECTORY = PROJECT_DIRECTORY + "Screenshots/"
	private static String CURRENT_SCREENSHOT_FOLDER
	private String TIMESTAMP = new SimpleDateFormat("HHmmssSSS").format(new Date()) 

	public String takeScreenshot(){
		WebUI.takeScreenshot()
	}

	public String takeScreenshot(String filename){
		String getFullDirectory =  CURRENT_SCREENSHOT_FOLDER + filename + ".JPG"
		KeywordUtil.logInfo("Screenshot " + getFullDirectory + " taken.")
		WebUI.delay(2)
		WebUI.takeScreenshot(getFullDirectory)
	}

	public boolean createNewFolder(){
		CURRENT_SCREENSHOT_FOLDER = SCREENSHOTS_DIRECTORY + TIMESTAMP + "/"
		KeywordUtil.logInfo("Folder " + CURRENT_SCREENSHOT_FOLDER + " created.")
		return new File(CURRENT_SCREENSHOT_FOLDER).mkdirs();
	}
}
