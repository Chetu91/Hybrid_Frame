import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.10.20.220:4200/auth/client-login");
		
//		driver.findElement(By.name("email")).sendKeys("chethan.s@testyantra.in");
//		driver.findElement(By.name("password")).sendKeys("8722184949");
//		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(" //button[@type='submit'] ")).submit();
		driver.findElement(By.xpath("//a[text()='Register']")).click(); 		
//		WebElement ele=driver.findElement(By.xpath("//button[text()='Logout']"));
//		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(ele)
//		Actions a=new Actions(driver);
//		a.moveToElement(ele).click().perform();
//		driver.close();
		
	}

}
