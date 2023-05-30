package com_medfit_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import generalUtils.ReadFiles;
import generalUtils.WebUtils;

public class LoginPage {
	public WebDriver driver;
	public WebUtils wutl=new WebUtils(); 
	public long ETO=10;
	ReadFiles rfile=new ReadFiles();
	
	public LoginPage(WebDriver driver, long ETO, WebUtils wutl) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wutl=wutl;   
		this.ETO=ETO;
		this.rfile=rfile;
	}
	
        @FindBy(xpath="//p[text()='Login/SignUp']")
        private WebElement clklogin;
	
	    @FindBy(xpath=" //span[text()=' Login as Admin']")
	    private WebElement clksignupadmin;	    
	
		@FindBy(xpath="//input[@type='username']")
		private WebElement entremail;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement entrpassword;
		
		@FindBy(xpath="//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root']//parent::button[@type='button']")
		private WebElement clkonpswdvisiblebtn;
		

		@FindBy(xpath="//button[text()=' Login']")
		private WebElement clksubmit;
		
		@FindBy(xpath="//h2[text()='Demographics']")
		private WebElement gettext;
		
		@FindBy(xpath="//div[@class='MuiBox-root css-2uchni']//span//parent::button[@type='button']")
		private WebElement clickonlogoutdrpdwn;
		
		@FindBy(xpath="//span[@class='ant-dropdown-menu-title-content']//p[text()=' Logout']")
		private WebElement clickonlogoutbutn;
		
		public void AdminSignUp() {
			wutl.synchronizeWait(driver);
			clksignupadmin.click();
		}
		
		public void AdminLogin() {
			wutl.synchronizeWait(driver);
			clklogin.click();
		}
		
		public void enteremail() throws Throwable {
//			wutl.synchronizeWait(driver, entremail);
			wutl.enterText(entremail, rfile.readPropertyFile("username"));
			
			}
		
		public void enterpassword() throws Throwable {
//			wutl.synchronizeWait(driver, entrpassword);
			wutl.enterText(entrpassword, rfile.readPropertyFile("password"));
			
			}
		
		public void clkOnsubmits() {
//			wutl.synchronizeWait(driver);
		   clksubmit.click();	
//		   String acttext = gettext.getText();
//		   String exctxt="Demographics";
//		   Assert.assertEquals(acttext, exctxt);
		   
		}
		
		public void ClkOnLogoutDrpdwn() {
			clickonlogoutdrpdwn.click();
		}
		
		public void ClkOnLogoutButtn() {
			clickonlogoutbutn.click();
		}
		
		public void ClkOnVisibleEyeIcon() {
			if(entrpassword.getAttribute("type").equalsIgnoreCase("password")) {
				clkonpswdvisiblebtn.click();
			}
		}
	

}
