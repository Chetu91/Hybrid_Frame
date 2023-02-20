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
	
	public LoginPage(WebDriver driver, long ETO, WebUtils wutl) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wutl=wutl;   
		this.ETO=ETO;
	}

		@FindBy(xpath="//input[@formcontrolname='email']")
		private WebElement entremail;
		
		@FindBy(name="password")
		private WebElement entrpassword;
		

		@FindBy(xpath="//span[text()='Login']")
		private WebElement clksubmit;
		
		@FindBy(xpath="//h2[text()='Demographics']")
		private WebElement gettext;
		
		public void enteremail(String email) {
			wutl.enterText(entremail, email);
			
			}
		
		public void enterpassword(String password) {
			wutl.enterText(entrpassword, password);
			
			}
		
		public void clkOnsubmits() {
			wutl.synchronizeWait(driver);
		   clksubmit.click();	
		   String acttext = gettext.getText();
		   String exctxt="Demographics";
		   Assert.assertEquals(acttext, exctxt);
		   
		}
		
	

}
