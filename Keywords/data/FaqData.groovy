package data

import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class FaqData extends Data {

	private static final String WORD_FAQ = "C:\\Automation\\Scripts\\UW\\A-QA\\CBDbene-project\\Data Files Sources\\CBD FAQ1 v4-FINAL.htm"

	private static final String XPATH_PRODUCT = "//p//span[not(contains(@style,'Times New Roman'))]"
	private static final String XPATH_PRODUCTS_NAME = "//b//u//span[contains(text(),'CBD')]"
	private static final String XPATH_QUESTIONS = "//p[contains(@class,'MsoListParagraph')]//b"
	List <Faq> faqs = new ArrayList<>()

	public List<String> getParagraphs(){
		return getTextsByXpath(XPATH_PRODUCT).findAll { it.matches(".*[a-zA-Z].*")}
	}

	public List<String> getProductsNames(){
		return getTextsByXpath(XPATH_PRODUCTS_NAME)
	}

	public List<String> getQuestions(){
		return getTextsByXpath(XPATH_QUESTIONS)
	}
	
	public void navigateTo(){
		WebUI.navigateToUrl(WORD_FAQ)
	}
	
	public List<Faq> getData(){
		List <String> productsNames = getProductsNames()
		List <String> paragraphs 	= getParagraphs()
		List <String> questionsList = getQuestions()
		List <String> questions = new ArrayList<>()
		List <String> answers = new ArrayList<>()
		String answer = ""
		for (int i = 0 ; i < productsNames.size(); i++){
			questions = new ArrayList<>()			
			answers   = new ArrayList<>()
			
			int productIndex = paragraphs.indexOf(productsNames.get(i)) + 1
			int productEnd = (i + 1) == productsNames.size() ? paragraphs.size():paragraphs.indexOf(productsNames.get((i + 1)))
			List<String> productParagraph = paragraphs.subList(productIndex, productEnd)
			
			println "-----------------"
			println productsNames.get(i)
			
			for (int j = 0 ; j < productParagraph.size(); j++){
				String paragraph = productParagraph.get(j)
				if (questionsList.contains(paragraph)){
					questions.add(paragraph)
				}
				else{
					answer += " " + paragraph
				}
				if ((j+1)== productParagraph.size() || questionsList.contains(productParagraph.get(j + 1))){
					answers.add(answer)
					answer=""
				}
				
			}
			Faq faq = new Faq(productsNames.get(i),questions,answers)
			faqs.add(faq)
			faqs.get(i).printQuestions()
			println faqs.get(i).getQuestions().size()
			faqs.get(i).printAnswers()
			println faqs.get(i).getAnswers().size()
		}
		return faqs
	}
}
