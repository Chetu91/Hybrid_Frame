package com_medfit_pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generalUtils.WebUtils;

public class HomePage {

	public WebDriver driver;
	public WebUtils wutl=new WebUtils(); 
	public long ETO=10;
	
	@FindBy(xpath=" //span[text()=' Demographics '] ")
	private WebElement clkdemographics;
	
	@FindBy(xpath=" //span[text()=' body-profile '] ")
	private WebElement clkbodypfile;
	
	@FindBy(xpath=" //span[text()=' Goals '] ")
	private WebElement clkgoals;
	
	@FindBy(xpath="//input[@formcontrolname='fullName']")
	private WebElement enterfname;
	
	@FindBy(xpath="//button[@type='button' and @aria-label='Open calendar']")
	private WebElement setdate;
	
	@FindBy(xpath="//button[@aria-label='Previous 24 years']")
	private WebElement clickprvius24years;
	
	@FindBy(xpath="//button[@aria-label='Next 24 years']")
	private WebElement clicknxt24years;
	
	@FindBys({@FindBy(xpath="//table/tbody//descendant::td[@role='gridcell']")})
	private List<WebElement> getdates;
	
	@FindBys({@FindBy(xpath="//table[@class='mat-calendar-table']//descendant::tr[@role='row']")})
	private List<WebElement> getmonths;
	
	@FindBys({@FindBy(xpath="//table[@class='mat-calendar-table']//tbody[@class='mat-calendar-body']")})
	private List<WebElement> getyears; 
	
	@FindBy(xpath="//button[@type='button']//descendant::span[contains(text(),'Female')]")
	private WebElement setsex;
	
	@FindBy(xpath="//div[@class='main']//descendant::input[@ng-reflect-name='address']")
	private WebElement setaddress;
	
	@FindBy(xpath="//div[@class='main']//descendant::input[@ng-reflect-name='pincode']")
	private WebElement setpincode;
	
	@FindBys({@FindBy(xpath="//div[@class='main']//descendant::mat-select[@ng-reflect-name='nationality']")})
	private List<WebElement> setnationality; 
	
	@FindBys({@FindBy(xpath="//div[@class='main']//descendant::mat-select[@ng-reflect-name='maritalStatus']")})
	private List<WebElement> setmaritalstatus;
	
	@FindBy(xpath="//div[@class='main']//descendant::input[@ng-reflect-name='familyType']")
	private WebElement setfamily;
	
	@FindBy(xpath="//div[@class='main']//descendant::input[@ng-reflect-name='designation']")
	private WebElement setdeignation;
	
	@FindBy(xpath="//div[@class='main']//descendant::input[@ng-reflect-name='company']")
	private WebElement setcompany;
	
	@FindBys({@FindBy(xpath="//div[@class='main']//descendant::mat-select[@ng-reflect-name='education']")})
	private List<WebElement> seteducation;
	
	@FindBys({@FindBy(xpath="//div[@class='main']//descendant::mat-select[@ng-reflect-name='occupation']")})
	private List<WebElement> setoccupation;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement clkonnext;

	public HomePage(WebDriver driver, long ETO, WebUtils wutl) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wutl=wutl;
		this.ETO=ETO;
	    
	}
	
	public void setFName(String values) {
		enterfname.clear();
		wutl.synchronizeWait(driver);
		wutl.enterText(enterfname,values);
	}
	
	public void clickOnDemographics() {
		clkdemographics.click();
	}
	
	public void clickOnBodyprofile() {
		clkbodypfile.click();
	}
	
	public void clickOnGoals() {
		clkgoals.click();
	}
	
	public void setDate(String date) {
		wutl.enterText(setdate, date);
	}
	
	public void setSex() {
		
		setsex.click();
	}
	
	public void setAddress(String address) {
		setaddress.clear();
		wutl.enterText(setaddress, address);
	}
	
	public void setPincode(String pincode) {
		setpincode.clear();
		wutl.enterText(setpincode, pincode);
	}
	
    public void setNationality(String Natnality) {
    	for(WebElement Nationality:setnationality) {
    		if(Nationality.getText().equals(Natnality)) {
    			Nationality.click();
    		}
    	}
    	//wutl.selctByIndex(setnationality, index);
    }
    
    
    public void setMaritalStatus(String status) {
    	for(WebElement mstatus:setmaritalstatus) {
    		if(mstatus.getText().equals(status)) {
    			mstatus.click();
    		}
    	}
    }
    

    public void setFamily(String family) {
    	setfamily.clear();
    	wutl.enterText(setfamily, family);
    }
    

    public void setDesignation(String designation) {
    	setdeignation.clear();
    	wutl.enterText(setdeignation, designation);
    }
    

    public void setCompany(String company) {
    	setcompany.clear();
    	wutl.enterText(setcompany, company);
    }
    

    public void setEducation(String education) {
    	for(WebElement seducation:seteducation) {
    		if(seducation.getText().equals(education)) {
    			seducation.click();
    		}
    	}
    //	wutl.selectByVisibletxt(seteducation, education);
    }
    
    
    public void setOccupation(String occupation) {
    	for(int i=0; i<setoccupation.size(); i++ ){		
    		if(setoccupation.get(i).getText().contains(occupation)) {
    			setoccupation.get(i).click();
    			break;
    		}
    	}
    	
    }
    
    
    public void setYearMonth(String year, String month, String date) {
    	setdate.click();
    	for(WebElement years:getyears) {
    		if(years.getText().contains(year)) {
    			years.click();
    		}else
    		{
    			clicknxt24years.click();
    			years.click();
    		}
    		for(WebElement months:getmonths) {
    			if(months.getText().contains(month)) {
    				months.click();
    			}
    			
    			for(WebElement dates:getdates) {
    				if(dates.getText().contains(date)) {
    					dates.click();
    				}
    			}
    		}
    		
    	}
    	
    }
	
    
    public void clickOnNext() {
    	clkonnext.click();
    }
    
}
