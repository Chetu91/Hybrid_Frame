package medifittest;

import org.testng.annotations.Test;

import generalUtils.BaseClass;
import generalUtils.Intializecls;

public class LoginTest extends BaseClass {


	@Test
	public void test() throws Throwable {
	
		String USERNAME = rfile.readPropertyFile("username");
		 String PASSWORD = rfile.readPropertyFile("password");
//		String Fname = rfile.readExcelFile("Details",3,1);
//		String Date=  rfile.readExcelFile("Details",3,2);
//		String Sex = rfile.readExcelFile("Details",3,3);
//		String Address = rfile.readExcelFile("Details",3,4);
//		String Pincode = rfile.readExcelFile("Details",3,5);
//		String Nationality = rfile.readExcelFile("Details",3,6);
//		String Marital = rfile.readExcelFile("Details",3,7);
//		String Family = rfile.readExcelFile("Details",3,8);
//		String Education = rfile.readExcelFile("Details",3,9);
//		String Occupation = rfile.readExcelFile("Details",3,10);
//		String Designation = rfile.readExcelFile("Details",3,11);
//		String Company=rfile.readExcelFile("Details",3,12);
		 
		 
		Intializecls il=new Intializecls(driver,ETO,wutl);
//		il.loginpage.enteremail(USERNAME);
//		il.loginpage.enterpassword(PASSWORD);
		il.loginpage.clkOnsubmits();
		il.homepage.setFName("Dhananjay");
//		il.homepage.setYearMonth("1994", "JUNE", "23");
		il.homepage.setSex();
		il.homepage.setAddress("Address");
		il.homepage.setPincode("560050");
		il.homepage.setNationality("Indian");
//		il.homepage.setMaritalStatus("Unmarried");
		il.homepage.setFamily("NuclearFamily");
//		il.homepage.setEducation("Bachelor's degree");
		il.homepage.setOccupation("Engineering Manager");
		il.homepage.setDesignation("Lead");
		il.homepage.setCompany("TATA");
		il.homepage.clickOnNext();
		
	}
	
}
