package review
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain

import base.BasePage

public class ReviewPopup extends BasePage{

	//TODO: Fix old xpaths
	private static final TestObject BUTTON_CBD_ISOLATE_500_MG = findTestObject('ReviewPopup/button_cbd_isolate_500_mg')
	private static final TestObject INPUT_HEADLINE 	  = findTestObject('ReviewPopup/input_headline')
	private static final TestObject INPUT_REVIEW	  = findTestObject('ReviewPopup/input_review')
	private static final TestObject BUTTON_SUBMIT	  = findTestObject('ReviewPopup/button_submit')
	private static String PATH_OVERALL_RATING  = "ReviewPopup/icon_overall_rating"
	private static String PATH_EFFECTIVENESS   = "ReviewPopup/icon_effectiveness"
	private static String PATH_QUALITY		   = "ReviewPopup/icon_quality"
	private static String PATH_VALUE_FOR_MONEY = "ReviewPopup/icon_value_for_money"
	private TestObject BUTTON_PRODUCT

	//TODO: Create generic Choose A Product method
	public void chooseAProduct(String productName){
			
	}
	
	public void chooseProductCBDIsolata500mg(){
		WebUI.click(BUTTON_CBD_ISOLATE_500_MG)
	}
	
	public void rateOverallRating(String starRating){
		rateFeature(PATH_OVERALL_RATING,starRating)
	}
	
	public void rateEffectiveness(String starRating){
		rateFeature(PATH_EFFECTIVENESS,starRating)
	}
	
	public void rateQuality(String starRating){
		rateFeature(PATH_QUALITY,starRating)
	}
	
	public void rateValueForMoney(String starRating){
		rateFeature(PATH_VALUE_FOR_MONEY,starRating)
	}
	
	public void rateProduct(String overallRating, String effectiveness, String quality, String valueForMoney){
		rateOverallRating(overallRating)
		rateEffectiveness(effectiveness)
		rateQuality(quality)
		rateValueForMoney(valueForMoney)
	}
	
	public void addHeadline(String headline){
		WebUI.setText(INPUT_HEADLINE, headline)
	}	
	
	public void writeReview(String review){
		WebUI.setText(INPUT_REVIEW, review)
	}	
	
	public void clickButtonSubmit(){
		WebUI.click(BUTTON_SUBMIT)
	}
	
	private void rateFeature(String pathToFeature , String starRating){
		TestObject feature = findTestObject(pathToFeature, [('starRating') : starRating])
		WebUI.click(feature)
	}
}
