package com_gos_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import generalUtils.WebUtils;

public class GosHomePage  {
	
	public WebDriver driver;
	public WebUtils wutl;
	public long ETO=10;
	
	
	public GosHomePage(WebDriver driver, long ETO, WebUtils wutl ){
		PageFactory.initElements(driver, this);
		this. driver =driver;
		this. wutl=wutl;
		this.ETO=ETO;
	}
	

	
	/*
	 * side bar menu options
	 */
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Dashboard']//ancestor::li")
	private WebElement clkondashboard;
	
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Manage Master']//ancestor::li//div")
	private WebElement clkonhomepage;

	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Company Profile']//ancestor::li")
	private WebElement clkoncompanyprofile;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Registration']//ancestor::li")
	private WebElement clkonregistration;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='My Booking']//ancestor::li")
	private WebElement clkonbookings;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Invoice']//ancestor::li")
	private WebElement clkoninvoice;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Inhouse Accounts']//ancestor::li")
	private WebElement clkoninhouseaccounts;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Calendar']//ancestor::li")
	private WebElement clkoninclalender;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Extranet Contract Rate']//ancestor::li")
	private WebElement clkoncontractrate;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::p[text()='Report']//ancestor::li")
	private WebElement clkonreport;
	
	@FindBy(xpath="//div[@class='ant-layout-sider-children']//descendant::div[@class='arrline']//ancestor::li")
	private WebElement clkonarrline;
	

	
	/*
	 * Home button menu options
	 */
	
	@FindBy(xpath="//p[text()='  Basic Settings']")
	private WebElement clkonbasicsetting;
	
	@FindBy(xpath="//p[text()=' Location Settings']")
	private WebElement clkonlocationsetting;
	
	@FindBy(xpath="//p[text()='  Hotel Settings']")
	private WebElement clkonhotelsettings;
	
	@FindBy(xpath=" //p[text()='  Agent Settings']")
	private WebElement clkonagentsettings;
	
	@FindBy(xpath=" //p[text()='  Package Settings']")
	private WebElement clkonpackagesettings;
	
	@FindBy(xpath=" //p[text()='Payment Gateway']")
	private WebElement clkonpaymentgateway;
	
	@FindBy(xpath=" //p[text()='Communication Mail']")
	private WebElement clkoncommunicationmail;
	
	@FindBy(xpath=" //p[text()='HouseboatSettings']")
	private WebElement clkonhouseboatsettings;
	
	@FindBy(xpath=" //p[text()='Coupon']")
	private WebElement clkoncoupon;
	
	

	
	/*
	 * Basic settings menu options
	 */
	
	@FindBy(xpath="//p[text()='Designation']//parent::div")
	private WebElement clkondesignation;
	
	@FindBy(xpath="//p[text()='Bank']//parent::div")
	private WebElement clkonbank;
	
	@FindBy(xpath="//p[text()='//p[text()='Currency']//parent::div")
	private WebElement clkoncurency;
	
	@FindBy(xpath="//p[text()='Assign Menu']//parent::div")
	private WebElement clkonassignmenu;
	
	@FindBy(xpath="//p[text()='Contact Type']//parent::div")
	private WebElement clkoncontacttype;
	
	@FindBy(xpath="//p[text()='Market Type']//parent::div")
	private WebElement clkonmarkuptype;
	
/*
 * Location setting menu options
 * 
 */
	
	@FindBy(xpath="//p[text()='Markup Type']//parent::div")
	private WebElement clkonmarkettype;
	
	@FindBy(xpath="//p[text()='//p[text()='Region']//parent::div")
	private WebElement clkonregion;
	
	@FindBy(xpath="//p[text()='Country']//parent::div")
	private WebElement clkoncountry;
	
	@FindBy(xpath="//p[text()='Province']//parent::div")
	private WebElement clkonprovince;
	
	@FindBy(xpath="//p[text()='Destination']//parent::div")
	private WebElement clkondestination;
	
	@FindBy(xpath="//div[@class='App']//descendant::h1[text()='Destination']")
	private WebElement getdestinationtext;
	
	/*
	 * Hotels Settings menu options
	 * 
	 */
	
	@FindBy(xpath="//p[text()='Hotel Category']//parent::div")
	private WebElement clkonhotelcategory;
	
	@FindBy(xpath="//p[text()='Hotel Type']//parent::div")
	private WebElement clkonhoteltype;
	
	@FindBy(xpath="//p[text()='Occupancy Type']//parent::div")
	private WebElement clkonoccupancy;
	
	@FindBy(xpath="//p[text()='Season Type']//parent::div")
	private WebElement clkonseasontype;
	
	@FindBy(xpath="//p[text()='Room Category']//parent::div")
	private WebElement clkonroomcategory;
	
	@FindBy(xpath="//p[text()='Room Type']//parent::div")
	private WebElement clkonroomtype;
	
	@FindBy(xpath="//p[text()='Hotel Amenity']//parent::div")
	private WebElement clkonhotelamenity;
	

    @FindBy(xpath="//p[text()='Room Amenity']//parent::div")
    private WebElement clkonroomamenity;
  

    @FindBy(xpath="//p[text()='Meal Plan']//parent::div")
    private WebElement clkonmealplan;

    /*
     * Agent settings menu options
     * 
     */
    
    @FindBy(xpath="//p[text()='Agent Category']//parent::div")
    private WebElement clkagentcategory;
    
    /*
     * 
     * Packagecategory settings menu options
     *  
     */
    
    @FindBy(xpath="//p[text()='Package Category']//parent::div")
    private WebElement clkonpakgcategory;
    
    @FindBy(xpath="//p[text()='Package Type']//parent::div")
    private WebElement clkonpakgtype;
    

    @FindBy(xpath="//p[text()='Day Activities']//parent::div")
    private WebElement clkondayactivity;
    
    @FindBy(xpath="//p[text()='Itinerary Details']//parent::div")
    private WebElement clkonitinerarydetails;
    
    @FindBy(xpath="//p[text()='Visa Information']//parent::div")
    private WebElement clkonvisainformation;
    
    @FindBy(xpath="//p[text()='Terms and Conditions']//parent::div")
    private WebElement clkontermandconditions;
    
    
    /*
     * Houseboat settings menu options
     * 
     */ 

    @FindBy(xpath="//p[text()='HouseboatType']//parent::div")
    private WebElement clkonhouseboattype;
    
    @FindBy(xpath="//p[text()='Houseboatroomcategory']//parent::div")
    private WebElement clkonhouseboatroomcategory;
    
    @FindBy(xpath="//p[text()='Houseboatroomtype']//parent::div")
    private WebElement clkonhouseboatroomtype;
    
    
    
    
	/*
	 * 
	 * Methods for side menu bar 
	 * 
	 */
    
	public void ClkOnDashBoard() {

		wutl.mouseAction(driver, clkondashboard);
	}

	
	public void ClkOnHome() {
		
		wutl.mouseAction(driver, clkonhomepage);
	}

	
	/* 
	 * 
	 *  methods for HomeMenu options
	 * 
	 */
	
	public void ClkOnBsicSetting() {
		
		wutl.mouseAction(driver, clkonbasicsetting);
		
	}
	
	public void ClkOnLocationSetting() {
		wutl.mouseAction(driver, clkonlocationsetting);
	}
	
	public void ClkOnHotelSettings() {
		wutl.mouseAction(driver, clkonhotelsettings);
	}
	
	public void ClkOnAgentSettings() {
		wutl.mouseAction(driver, clkonagentsettings);
	}
	
	public void ClkOnPackageSetting() {
		wutl.mouseAction(driver, clkonpackagesettings);
	}
	
	public void ClkOnPaymentGateway() {
	//	wutl.mouseAction(driver, clkonpaymentgateway);
		clkonpaymentgateway.click();
	}
	
	public void ClkOnCommunicationMail() {
	//	wutl.mouseAction(driver, clkoncommunicationmail);
		clkoncommunicationmail.click();
	}
	
	public void ClkOnHouseBoatSettings() {
		wutl.mouseAction(driver, clkonhouseboatsettings);
	}
	
	public void ClkOnCupon() {
		//wutl.mouseAction(driver, clkoncoupon);
		clkoncoupon.click();
	}
	
	
	/*
	 * methods for Basic settings options
	 */
	
	public void ClkOnDesignation() {
		
		wutl.mouseAction(driver, clkondesignation);
		clkondesignation.click();
	}
	
	public void ClkOnBank() {
		
		clkonbank.click();
	}
	
	public void ClkOnCurrency() {
		
		clkoncurency.click();
	}
	
	public void ClkOnAssignmenu() {
		
		clkonassignmenu.click();
	}
	
	public void ClkOnContactType() {
		
		clkoncontacttype.click();
	}
	
	public void ClkonMarkUpType() {
		
		clkonmarkuptype.click();
	}

	/*
	 * Methods for Location settings options
	 */

	public void ClkonMarketType() {
		clkonmarkettype.click();
	}
	
	public void Clkonregion() {
		clkonregion.click();
	}
	
	public void ClkOnCountry() {
		clkoncountry.click();
	}
	
	public void ClkOnProvince() {
		clkonprovince.click();
	}
	
	public void ClkOnDestination() {
		clkondestination.click();
		System.out.println(getdestinationtext.getText());
		String exp="Destination";
		Assert.assertEquals(getdestinationtext.getText(), exp);
	}
	
	/*
	 * Methods for Hotel settings menu
	 * 
	 */
	
	public void ClkOnHotelCategory() {
		clkonhotelcategory.click();
	}
	
	public void ClkOnHotelType() {
		clkonhoteltype.click();
	}
	
	public void ClkOnOccupancyType() {
		clkonoccupancy.click();
	}
	
	public void ClkOnSeasonType() {
		clkonseasontype.click();
	}
	
	public void ClkOnRoomCategory() {
		clkonroomcategory.click();
	}
	
	public void ClkOnRoomType() {
		clkonroomtype.click();
	}
	
	public void ClkOnHoteAmenity() {
		clkonhotelamenity.click();
	}
	
	public void ClkOnRoomAmenity() {
		clkonroomamenity.click();
	}
	
	public void ClkOnMealPlan() {
		clkonmealplan.click();
	}
	
	/*
	 * 
	 * Houseboat settings menu options 
	 * 
	 */
	
    public void ClkOnHouseBoatType() {
    	clkonhouseboattype.click();
	}
	
    public void ClkOnHouseBoatRoomcategory() {
	    clkonhouseboatroomcategory.click();	
	}
    
	public void ClkOnHouseBoatRoomType() {
	    clkonhouseboatroomtype.click();	
	}
	
}
