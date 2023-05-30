package com_gos_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.10.20.23:3001");
		driver.findElement(By.xpath("//p[text()='Login/SignUp']")).click();
		driver.findElement(By.xpath("//span[text()=' Login as Admin']")).click();
		driver.findElement(By.xpath("//input[@type='username']")).sendKeys("megha");
		WebElement pswdele = driver.findElement(By.xpath("//input[@type='password']"));
		pswdele.sendKeys("megha@123");
		System.out.println(pswdele.getAttribute("type"));
		
		if(pswdele.getAttribute("type").equalsIgnoreCase("password")) {
			WebElement clkeye = driver.findElement(By.xpath("//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root']//parent::button[@type='button']"));
			clkeye.click();
			clkeye.isEnabled();
			System.out.println("After click on eye icon:" +pswdele.getAttribute("type"));
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root']//parent::button[@type='button']"));
		driver.findElement(By.xpath("//button[text()=' Login']")).click();
		driver.close();

	}

}
