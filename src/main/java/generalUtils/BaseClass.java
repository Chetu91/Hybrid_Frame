package generalUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {

	public static WebDriver staticdriver; 
	public  WebDriver driver;
	public ReadFiles rfile=new ReadFiles();
	public WebUtils wutl=new WebUtils();
	public long ETO = 10;
	
	
	@BeforeClass
	public void launchBrowser() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriverManager.chromedriver().setup();
		String Browser = rfile.readPropertyFile("browser");
		if(Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else {
			 driver=new FirefoxDriver();
		}
		System.out.println("LaunchBrowser");
		staticdriver=driver;
	}
	
	@BeforeMethod
	public void oppApp() throws Throwable {
		String URL=rfile.readPropertyFile("url");
		String USERNAME=rfile.readPropertyFile("username");
		String PASSWORD=rfile.readPropertyFile("password");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
//		driver.findElement(By.name("email")).sendKeys(USERNAME);
//		driver.findElement(By.name("password")).sendKeys(PASSWORD);
//		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	    System.out.println("oppenapplication");
		
	}
	
	@AfterMethod
	public void closeApp() {
//		wutl.synchronizeWait(driver);
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Logout']"));
//		wutl.mouseAction(driver, ele);
		
		System.out.println("closeapplication");	
	}
	
	@AfterClass
	public void closeBrowser() {
		
    driver.close();
	System.out.println("closeBrowser");	
	}
}
