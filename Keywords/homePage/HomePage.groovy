package homePage
import base.BasePage
import footer.FooterSection
import mainHeader.MainHeaderSection

public class HomePage extends BasePage{
	
	private AgeWarningPopup ageWarningPopup = new AgeWarningPopup()
	private MainHeaderSection mainHeader 	= new MainHeaderSection()
	private FooterSection footerSection 	= new FooterSection()
	
	public HomePage (){
	}
}
