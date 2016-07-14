package makarand_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Actions_Hoverpage {
	
	public static void main(String ar[]) throws InterruptedException
	{
		
//		DesiredCapabilities capabilities= DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver=new FirefoxDriver(capabilities);
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/data%20dsk/Actions%20Menus%20-%20Selenium/Actions%20Menus%20-%20Selenium/Hover.html");
		
		Actions ac=new Actions(driver);
		
		WebElement home_ele= driver.findElement(By.id("home"));
		WebElement abou_elet= driver.findElement(By.id("about"));
		WebElement services_ele= driver.findElement(By.id("services"));
		WebElement web_dev_ele= driver.findElement(By.xpath(".//*[@id='services']/ul/li[2]"));
		
//		•	Mouse over from Home-> About -> Services
		ac.moveToElement(home_ele).build().perform();
		ac.moveToElement(abou_elet).perform();
		ac.moveToElement(services_ele).perform();
		Thread.sleep(5000);
		
//		•	On Services -> mouse over on Web Development and •	Click on Web Development menu
		ac.moveToElement(home_ele).perform();
		ac.moveToElement(services_ele).moveToElement(web_dev_ele).perform();
	}

}
