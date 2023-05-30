package generalUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;



public class WebUtils {
	
	
	
	public void selctByIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
			
	}
	
	public void selectByVlaue(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public void selectByVisibletxt(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	
	public void switchToFrame(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void acceptpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void dismisspopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void windowHandle(WebDriver driver, String partialtitle){
		
		String parent=driver.getWindowHandle(); //get parent window
		Set<String> child = driver.getWindowHandles();  //parent and child window
		
		Iterator<String> it = child.iterator(); //intiate interator
		
		while(it.hasNext()) {                   // condition to check win id
		String childid = it.next();	             
		String title = driver.switchTo().window(childid).getTitle();	//get child id title
		if(title.contains(partialtitle)) {
			break;
		}
		
		}
		
	}
	
	public void rightClkmouse(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
		}
	
	public void mouseAction(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		}
	
	public void diubleClk(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void scrollToElement(WebDriver driver, WebElement element) {
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    int y = element.getLocation().getY();
	    js.executeScript("window.scrollBy(0,"+y+")",element );
	}
	
	public void getScreenShot(WebDriver driver, String screenshotname) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot" +screenshotname+ ".png");
		Files.copy(src, dest);
	}	
	
	public void elementClkable(WebElement element) {
		element.click();
	}
	
	public void enterText(WebElement element, String values) {
		element.sendKeys(values);
	}
	public void synchronizeWait(WebDriver driver, WebElement element) {
		WebDriverWait wa=new WebDriverWait(driver, 20);
		wa.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void synchronizeWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}

