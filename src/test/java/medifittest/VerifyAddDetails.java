package medifittest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com_medfit_pom.HomePage;
import generalUtils.BaseClass;
import generalUtils.Intializecls;

//@Listeners(generalUtils.ILisnerstest.class)

public class VerifyAddDetails extends BaseClass { 

	
	@Test
	public void test() throws Throwable {
	String fname = rfile.readExcelFile("Details",3, 1);
		 String USERNAME = rfile.readPropertyFile("username");
		 String PASSWORD = rfile.readPropertyFile("password");
		Intializecls il=new Intializecls(driver,ETO,wutl);
		il.rgisterpage.naviageToRegister();
		il.rgisterpage.setPhoneNum(USERNAME);
		il.rgisterpage.setEmailid(PASSWORD);
		il.rgisterpage.clkOnRegister();
		il.homepage.setFName("Chethan");
		
	}
	
}

