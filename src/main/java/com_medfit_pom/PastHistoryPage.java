package com_medfit_pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generalUtils.WebUtils;

public class PastHistoryPage {

	

	public WebDriver driver;
	public WebUtils wutl=new WebUtils();
	public long ETO=10;	
		
		 PastHistoryPage(){
			PageFactory.initElements(driver, this);
			this.driver=driver;
			this.wutl=wutl;
			this.ETO=10;
		}
		 
		 @FindBy(xpath="(//span[@class='on'])[1]") 
		 private WebElement togglebutton;
		 
		 @FindBy(xpath="//input[@ng-reflect-name='diagnosis']")
		 private WebElement entrdaignosis;
		 
		 @FindBy(xpath="//input[@ng-reflect-name='medication']")
		 private WebElement entrmedication;
		 
		 @FindBy(xpath="//input[@ng-reflect-name='dosage']")
		 private WebElement entrdosage;
		 
		 @FindBy(xpath="//input[@ng-reflect-name='additionalInformation']")
		 private WebElement entraddinfo;
		 
		 @FindBys({@FindBy(xpath="//mat-select[@ng-reflect-name='frequency']")})
			private List<WebElement> selectfrequency;
		 
		 
		 @FindBy(xpath="(//mat-label[text()='Date Of Diagnosis']//parent::div//descendant::button[@type='button' and @aria-label='Open calendar'])[1]")
			private WebElement selectdate;
			
			@FindBy(xpath="//mat-calendar-header[@class='ng-star-inserted']//button[@type='button']//child::span[@id='mat-calendar-button-0']")
			private WebElement clkonyear;

			public WebElement selectyear(String year) {
				 WebElement years=driver.findElement(By.xpath("//div[contains(.,'" +year+ "')]"));
				 return years;
				
			}
			
			
			public WebElement selectmonth(String month) {
				 WebElement months=driver.findElement(By.xpath("//div[contains(.,'" +month+ "')]"));
				 return months;
				
			}
			
			public WebElement selectday(String day) {
				 WebElement days=driver.findElement(By.xpath("//div[contains(.,'" +day+ "')]"));
				 return days;
				
			}
		 
			@FindBy(xpath="(//mat-label[text()='Start Date']//parent::div//descendant::button[@type='button' and @aria-label='Open calendar'])[1]")
			private WebElement selectstartdate;
			
			@FindBy(xpath="//mat-calendar-header[@class='ng-star-inserted']//button[@type='button']//child::span[@id='mat-calendar-button-7']")
			private WebElement selectstartyear;
			
			
			@FindBy(xpath="(//mat-label[text()='Stop Date']//parent::div//descendant::button[@type='button' and @aria-label='Open calendar'])[1]")
			private WebElement selectstopdate;
			
			@FindBy(xpath="//mat-calendar-header[@class='ng-star-inserted']//button[@type='button']//child::span[@id='mat-calendar-button-8']")
			private WebElement selectstopyear;
		 
			@FindBy(xpath="(//span[text()='Upload']//parent::button)[1]")
			private WebElement uploadreport;
		 
			@FindBy(xpath="//input[@ng-reflect-name='surgeryName']")
			private WebElement entrsurgeryname;
			
			@FindBy(xpath="//input[@ng-reflect-name='mentionInspecific']")
			private WebElement entrspecific;
			
			
			public void setDiagnosis(String diagnosis) {
				wutl.enterText(entrdaignosis, diagnosis);
				
			}
			
			public void setMedication(String medication) {
				wutl.enterText(entrmedication, medication);
				
			}
			
			public void setDosage(String dosage) {
				wutl.enterText(entrdosage, dosage);
				
			}
			
		 
		 public void setFrequency(String frequency) {
				for(WebElement mstatus:selectfrequency) {
		    		if(mstatus.getText().equals(frequency)) {
		    			mstatus.click();
		    		}
		    	}
				
			}
		 
		 public void setDateofDaignosis(String year,String month,String day) {
				wutl.elementClkable(selectdate);
				selectdate.click();
				clkonyear.click();
				selectyear(year).click();
				selectmonth(month).click();
				selectday(day).click();
				
				
			}
			
			public void setStartDate(String year,String month,String day) {
				wutl.elementClkable(selectstartdate);
				selectstartdate.click();
				selectstartyear.click();
				selectyear(year).click();
				selectmonth(month).click();
				selectday(day).click();		
				
			}
			
			public void setStopDate(String year,String month,String day) {
				wutl.elementClkable(selectstopdate);
				selectstopdate.click();
				selectstopyear.click();
				selectyear(year).click();
				selectmonth(month).click();
				selectday(day).click();		
				
			}
			
			public void setAddInfo(String addinfo) {
				wutl.enterText(entraddinfo, addinfo);
				
			}
			
			public void uploadReport(String upload) {
				wutl.enterText(uploadreport, upload);
				
			}


			public void setSpecificReason(String specifi) {
				wutl.enterText(entrspecific, specifi);
				
			}


}
