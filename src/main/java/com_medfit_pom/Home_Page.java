package com_medfit_pom;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_Page {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://10.10.20.14:3001");
//		driver.navigate().to("http://10.10.20.14:3001");
		driver.findElement(By.xpath("//p[text()='Login/SignUp']")).click();
		try {
		driver.findElement(By.xpath("//span[text()=' Login as Admin']")).click();
		}
		catch(Exception e) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./screenshot/gos.png");
			Files.copy(src, dest);
		}
		
		driver.findElement(By.xpath("//input[@type='username']")).sendKeys("megha");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("megha@123");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='ant-menu-submenu-title']//descendant::p[text()='Manage Master']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.close();
	}
}
