package com_medfit_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generalUtils.WebUtils;

public class RegisterPage {
	
	public WebDriver driver;
	public WebUtils wutl=new WebUtils(); 
	public long ETO=10;
	
	public RegisterPage(WebDriver driver, long ETO, WebUtils wutl) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wutl=wutl;
		this.ETO=ETO;
	
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement clickonregister;
	
	public WebElement getClickonregister() {
		return clickonregister;
	}

	@FindBy(name="phoneNumber")
	private WebElement entrphnnum;
	
	@FindBy(name="email")
	private WebElement entremail;

	@FindBy(xpath="//span[text()='Register']")
	private WebElement clkregister;
	
	@FindBy(xpath="//h4[text()='Already have an account ? ']")
	private WebElement gettext;
	

	@FindBy(xpath="//a[text()='Login']")
	private WebElement clklogin;
	
	public void setPhoneNum(String pnumber) {
		wutl.synchronizeWait(driver, entrphnnum);
		String title = driver.getTitle();
		String actitle="MediFIT";
		System.out.println(gettext);
		if(gettext.isDisplayed()) {
		wutl.enterText(entrphnnum, pnumber);
		}
		Assert.assertEquals(title, actitle);
	}
	
	public void setEmailid(String email) {
		wutl.synchronizeWait(driver);
		wutl.enterText(entremail, "email");
	}
	
	public void clkOnRegister() {
		wutl.synchronizeWait(driver);
		clkregister.click();
	}
	
	public void naviageToRegister() {
		wutl.synchronizeWait(driver);
		clickonregister.click();
		
	}
}
