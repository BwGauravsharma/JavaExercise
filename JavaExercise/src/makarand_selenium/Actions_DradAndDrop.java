package makarand_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Actions_DradAndDrop {
	
	public static void main(String ar[]) throws InterruptedException
	{
		
//		DesiredCapabilities capabilities= DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver=new FirefoxDriver(capabilities);
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/data%20dsk/Actions%20Menus%20-%20Selenium/Actions%20Menus%20-%20Selenium/drag-and-drop.html");
		
		Actions ac=new Actions(driver);
		
		WebElement container= driver.findElement(By.id("obliterate"));
		WebElement one= driver.findElement(By.id("one"));
		WebElement two= driver.findElement(By.id("two"));
		WebElement three= driver.findElement(By.id("three"));
		WebElement four= driver.findElement(By.id("four"));
		WebElement five= driver.findElement(By.id("five"));
		
		ac.dragAndDrop(container, one).perform();
		ac.dragAndDrop(container, two).perform();
		ac.dragAndDrop(container, three).perform();
		ac.dragAndDrop(container, four).perform();
		ac.dragAndDrop(container, five).perform();
		
		Thread.sleep(5000);

	}

}
