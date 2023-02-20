package generalUtils;

import org.openqa.selenium.WebDriver;

import com_medfit_pom.BodyprofilePage;
import com_medfit_pom.CurrentHistoryPage;
import com_medfit_pom.GoalsPage;
import com_medfit_pom.HomePage;
import com_medfit_pom.LoginPage;
import com_medfit_pom.RegisterPage;

public class Intializecls {
	
	public HomePage homepage;
	public RegisterPage rgisterpage;
	public LoginPage loginpage;
	public BodyprofilePage bodyprofilepage;
	public CurrentHistoryPage currenthistorypage;
	public GoalsPage goalspage;
	
	public Intializecls(WebDriver driver,long ETO,WebUtils wutl) {
	
		rgisterpage=new RegisterPage(driver,ETO,wutl);
		loginpage=new LoginPage(driver,ETO,wutl);
		homepage=new HomePage(driver,ETO,wutl);
		bodyprofilepage=new BodyprofilePage(driver,ETO,wutl);
		goalspage=new GoalsPage(driver,ETO,wutl);
		currenthistorypage=new CurrentHistoryPage(driver,ETO,wutl);
		
	
	
	}

}
