import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import helper.*
class TestListeners {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */

	@BeforeTestCase
	def startBrowser(TestCaseContext testCaseContext) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		createScreenshotFolder(testCaseContext)
	}
	
	def createScreenshotFolder(TestCaseContext testCaseContext) {
		if (testCaseContext.getTestCaseId()=="Test Cases/CBdbene-07_Screenshots"){
			Screenshot screenshot = new Screenshot()
			screenshot.createNewFolder()
		}
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	
	@AfterTestCase
	def closeBrowser(TestCaseContext testCaseContext) {
		WebUI.closeBrowser()
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */	
	
	/*
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}
	 */

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	/*
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}
	
	*/
}