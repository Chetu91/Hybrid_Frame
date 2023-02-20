package com_medfit_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalUtils.WebUtils;

public class GoalsPage {
	
	public WebDriver driver ;
	public long ETO=10;
	public WebUtils wutl=new WebUtils();
	
	public GoalsPage(WebDriver driver, long ETO, WebUtils wutl) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wutl=wutl;
		this.ETO=10;
	}
	
	private WebElement selelctgoals(String goals) {
	 WebElement goal = driver.findElement(By.xpath("//mat-chip[contains(text(),' "+goals+" ')]"));
	 return goal;

	}
	
	private WebElement setratings() {
		WebElement rating = driver.findElement(By.xpath("//p[contains(text(),'Take nutritional supplements each day')]//ancestor::div[@class='motivation']//descendant::mat-chip[contains(text(),' 1')]"));
		return rating;
	}
	
		@FindBy(xpath="//button[text()=' Next ']")
		private WebElement clkonnxt;

		@FindBy(xpath="//button[text()='Previous']")
		private WebElement clkonprevious;
		
		public void setGoals(String goal) {
			wutl.elementClkable(selelctgoals(goal));
	}
	
		public void clkOnNxt() {
			wutl.elementClkable(clkonnxt);
		}
		
		public void clkOnPrevious() {
			wutl.elementClkable(clkonprevious);
		}

}
