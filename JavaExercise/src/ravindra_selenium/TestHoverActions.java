package ravindra_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestHoverActions {

	public static void main(String[] args) {
		

//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver();
		
		
		String path = "C:\\eclipse_1\\chrome\\";
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ravindram/Desktop/Actions%20Menus%20-%20Selenium/Hover.html");
		driver.manage().window().maximize();
		WebElement home = driver.findElement(By.id("home"));
		WebElement about = driver.findElement(By.id("about"));
		WebElement services = driver.findElement(By.id("services"));
		WebElement web_devlopement = driver.findElement(By.xpath(".//*[@id='services']/ul/li[2]"));
		try{
		Actions action = new Actions(driver);
		action.moveToElement(home).perform();
		Thread.sleep(100);
		action.moveToElement(about).perform();
		Thread.sleep(100);
		action.moveToElement(services).moveToElement(web_devlopement).click(web_devlopement).build().perform();
		
		}catch(Exception e){}

	}

}
