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

import internal.GlobalVariable

public class Attributes {

	private static ArrayList <String> attributes = new ArrayList<String>()


	public Attributes(String rawAttributes){

		while (attributesExists(rawAttributes)){
			println "-------------------"
			String oneAttribute = getAnAttribute(rawAttributes)
			println oneAttribute
			rawAttributes = getNextAttributes(rawAttributes)
			println rawAttributes
			attributes.add(oneAttribute)
			println attributes
			println "-------------------"
		}
	}

	private String getAnAttribute(String rawAttributes){
		return rawAttributes.substring(rawAttributes.indexOf("{") + 1, rawAttributes.indexOf("}"))
	}

	private boolean attributesExists(String rawAttributes){
		return rawAttributes.contains("{")
	}

	private String getNextAttributes(String rawAttributes){
		int lastIndex = !isTheLastAttribute(rawAttributes)?2:0
		return rawAttributes.substring(rawAttributes.indexOf("}") + lastIndex)
	}

	public ArrayList <String> getAttributesList(){
		return attributes
	}

	private boolean isTheLastAttribute(String rawAttributes){
		return rawAttributes.indexOf("}") == rawAttributes.length() - 1
	}

	public String getTitle(String attribute){
		int titleInitial = attribute.indexOf(":") + 1
		int titleEnd 	 = attribute.indexOf("description") - 2
		return attribute.substring(titleInitial, titleEnd).replace('"', '')
	}

	public String getDescription(String attribute){
		int titleInitial = attribute.indexOf("description")
		return attribute.substring(titleInitial).replace('description', '').replace('"', '').replace(":", "")
	}

	public String getDescription(int index){
		return getDescription(attributes[index])
	}

	public String getTitle(int index){
		return getTitle(attributes[index])
	}
}
