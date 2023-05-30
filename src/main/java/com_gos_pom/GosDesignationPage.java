package com_gos_pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generalUtils.WebUtils;

public class GosDesignationPage {
	
	
	public WebUtils wutl;
	public WebDriver driver;
	public long ETO;
	
	public GosDesignationPage(WebDriver driver, long ETO,WebUtils wutl ) {
		PageFactory.initElements(driver, this);
		this.wutl=wutl;
		this.driver=driver;
		this.ETO=ETO;
		
	}
	
	@FindBy(xpath="//div[@class='table-create-btn' and text()='Create']")
	private WebElement clkoncreatebtn;
	
	@FindBy(xpath="//span[text()='Back']")
	private WebElement clkonbacktab;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement clkondropdown;
	
	@FindBy(xpath="//input[@type='text' and @placeholder='Search']")
	private WebElement entrsearch;
	
	@FindBy(xpath="//input[@placeholder='Designation' and@type='text']")
	private WebElement entrdesignation;
	
	@FindBy(xpath="//p[text()='Create']//parent::button[@type='button']")
	private WebElement clkoncreatebttn;
		
	@FindBy(xpath="//p[text()='Reset']//parent::button[@type='button']")
	private WebElement clkonresetbuttn;
	
	@FindBy(xpath="//p[text()='Cancel']//parent::button[@type='button']")
	private WebElement clkoncancelbttn;
	
	@FindBy(xpath="//input[@type='text' and @placeholder='Designation']//following-sibling::p")
	private WebElement getvalidationmessage;
	
	@FindBy(xpath="//div[@class='ant-modal-content']//descendant::label[@class='modal-title fw-600 ff-open-sans']")
	private WebElement getpopupheadername;
	
	@FindBy(xpath="//div[@class='ant-notification-notice-message']")
	private WebElement getalreadyexisttoaster;
	
	@FindBys({@FindBy(xpath="//table//tbody[@class='ant-table-tbody']//tr//td[2]")})
	private List<WebElement> getdesignation;
	
	public void ClkOnCreateBtn() {
	    wutl.synchronizeWait(driver, clkoncreatebtn);
		clkoncreatebtn.click();
		getpopupheadername.isDisplayed();
		System.out.println(getpopupheadername.getText());
	
	}
	
	public void SetDesignation(String designation) {
		entrdesignation.sendKeys(designation);
		
	}
	
	
	public void ClkCreateBttn() {
		try {
		wutl.synchronizeWait(driver, clkoncreatebttn);
		clkoncreatebttn.click();
		String validmessg = getvalidationmessage.getText();
	    Reporter.log(validmessg);
//		Assert.assertEquals(validmessg, "Designation required");
		}
		catch(Exception e) {
			Reporter.log("entered designation");
		}
	}
	
	public void ClkReset() {
		try {
			
        wutl.synchronizeWait(driver, getvalidationmessage);
		if(getvalidationmessage.isDisplayed()) {
			clkonresetbuttn.click();				
		  }		
	    }
		catch(Exception e) {
		Reporter.log("Set designation");	
		}
		
	}
	public void GetAlreadyExisttoaster(){
//		wutl.synchronizeWait(driver, getalreadyexisttoaster);
//		String actual=getalreadyexisttoaster.getText();
//		System.out.println(actual);
		for(WebElement deslist:getdesignation) {
			System.out.println(deslist.getText());
			if(deslist.getText().equals(entrdesignation)) {
				System.out.println(getalreadyexisttoaster.isDisplayed());
			}
		}
		
		
	}

}
