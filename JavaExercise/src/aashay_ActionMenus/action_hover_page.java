package aashay_ActionMenus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class action_hover_page {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebElement e1,e2,e3,e4;
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Aashay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Aashay/Selenium/Actions%20Menus%20-%20Selenium/Hover.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
						
		e1 = driver.findElement(By.id("home"));
		e2 = driver.findElement(By.id("about"));
		e3 = driver.findElement(By.id("services"));
		e4 = driver.findElement(By.xpath(".//*[@id='services']/ul/li[2]"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(e1).build().perform();
		action.moveToElement(e2).build().perform();
		action.moveToElement(e3).build().perform();
		action.moveToElement(e4).build().perform();
		action.click();
		
	}

}
