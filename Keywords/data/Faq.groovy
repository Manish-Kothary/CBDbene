package data

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.apache.poi.xwpf.usermodel.XWPFDocument
import org.apache.poi.xwpf.usermodel.XWPFHeader
import org.apache.poi.xwpf.usermodel.XWPFParagraph
import org.apache.poi.xwpf.usermodel.XWPFRelation
import org.apache.poi.xwpf.usermodel.XWPFStyles
import org.junit.After

import internal.GlobalVariable

public class Faq {

	private String productName
	private List <String> questions, answers

	public Faq(String _productName, List<String> _questions, List<String> _answers){
		productName = _productName
		questions  = _questions
		answers	= _answers
	}
	
	public String getProductName(){
		return productName
	}
	
	public List <String> getQuestions(){
		return questions
	}
	
	public List <String> getAnswers(){
		return answers
	}
	
	public void printQuestions(){
		println questions
	}
	public void printAnswers(){
		println answers
	}
}
