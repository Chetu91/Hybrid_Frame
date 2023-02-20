package com_medfit_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalUtils.WebUtils;

public class BodyprofilePage {

	public WebDriver driver;
	public long ETO=10;
	public WebUtils wutl=new WebUtils();
	
	public BodyprofilePage(WebDriver driver,long ETO, WebUtils wutl) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.ETO=10;
		this.wutl=wutl;
	}
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='height']")
	private WebElement setheight;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='shoulderCircumference']")
	private WebElement setshouldercircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='armCircumference']")
	private WebElement armcircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='waistCircumference']")
	private WebElement waistcircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='thighCircumference']")
	private WebElement thighcircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='weight']")
	private WebElement setweight;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='neckCircumference']")
	private WebElement neckcircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='chestCircumference']")
	private WebElement chestcircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='hipCircumference']")
	private WebElement hipcircum;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='calfCircumference']")
	private WebElement calfcircum;
	
	@FindBy(xpath="(//p[text()='Back']//ancestor::div//descendant::img[@class='ng-star-inserted'])[1]")
	private WebElement setfrontimage;
	
	@FindBy(xpath="(//p[text()='Back']//ancestor::div//descendant::img[@class='ng-star-inserted'])[2]")
	private WebElement setbackimages;
	
	@FindBy(xpath="(//p[text()='Back']//ancestor::div//descendant::img[@class='ng-star-inserted'])[3]")
	private WebElement setsideimage;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='skeletalMuscle']")
	private WebElement setskeletalmuscle;
	
	@FindBy(xpath="//div[@class='mat-tab-body-wrapper']//descendant::input[@ng-reflect-name='visceralFat']")
	private WebElement setvisceralfat;
	
	@FindBy(xpath="//button[text()='Previous']")
	private WebElement clkonprevious;
	
	@FindBy(xpath="//button[text()=' Next ']")
	private WebElement clkonnext;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Cm']")
	private WebElement setincm;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Inches']")
	private WebElement setininches;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Kg']")
	private WebElement setinkg;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Lbs']")
	private WebElement setinlbs;


	
	public void setHeight(String height) {
		wutl.enterText(setheight, height);
	}
	
	public void setWeight(String weight) {
		wutl.enterText(setheight, weight);
	}
	
	public void setShouldercircum(String shoulder) {
		wutl.enterText(setshouldercircum, shoulder);
	}
	
	public void setArmcircum(String arm) {
		wutl.enterText(armcircum, arm);
	}
	
	public void setWaistcircum(String waist) {
		wutl.enterText(waistcircum, waist);
	}
	
	public void setThighcircum(String thigh) {
		wutl.enterText(thighcircum, thigh);
	}
	
	public void setNeckcircum(String neck) {
		wutl.enterText(neckcircum, neck);
	}
	
	public void setChestcircum(String chest) {
		wutl.enterText(chestcircum, chest);
	}
	
	public void setHipcircum(String hip) {
		wutl.enterText(hipcircum, hip);
	}
	
	public void setCalfcircum(String calf) {
		wutl.enterText(calfcircum, calf);
	}
	
	public void setFrontImage(String fpath) {
	    wutl.enterText(setfrontimage, fpath);
	}
	
	public void setBackImage(String bpath) {
	    wutl.enterText(setbackimages, bpath);
	}
	
	public void setSideImage(String spath) {
	    wutl.enterText(setsideimage, spath);
	}
	

}
