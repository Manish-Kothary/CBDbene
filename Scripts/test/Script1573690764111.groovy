import data.Faq
import data.FaqData as FaqData

FaqData word = new FaqData()

word.navigateTo()

List <Faq> faqs = word.getData()

for (int i = 0 ; i < faqs.size() ; i++){
	faqs.get(i).printQuestions()
	faqs.get(i).printAnswers()
}
//word.getAnswers()
//
//word.getParagraphs()
//
//word.getQuestions()
