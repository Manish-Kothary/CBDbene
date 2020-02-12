import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class WordUtils {
	
	public void readFile(){
	
	try {
		File file = new File("C:\\Automation\\Scripts\\UW\\A-QA\\CBDbene-project\\Data Files Sources\\CBD FAQ1 v3-FINAL.docx");

		FileInputStream fis = new FileInputStream(file.getAbsolutePath());
		
		XWPFDocument document = new XWPFDocument(fis);
			
		document
		
		List<XWPFParagraph> paragraphs = document.getParagraphs();

		for (XWPFParagraph para : paragraphs) {
			System.out.println(para.getText());
		}
		
		fis.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}