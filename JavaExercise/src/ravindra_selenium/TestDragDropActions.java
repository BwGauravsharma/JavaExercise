package ravindra_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestDragDropActions {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/ravindram/Desktop/Actions%20Menus%20-%20Selenium/drag-and-drop.html");
		driver.manage().window().maximize();
		WebElement target = driver.findElement(By.id("obliterate"));
		WebElement source1 = driver.findElement(By.id("one"));
		WebElement source2 = driver.findElement(By.id("two"));
		WebElement source3 = driver.findElement(By.id("three"));
		WebElement source4 = driver.findElement(By.id("four"));
		WebElement source5 = driver.findElement(By.id("five"));
		
		try{
		Actions action = new Actions(driver);
		action.dragAndDrop(source1, target).perform(); 
		Thread.sleep(200);
		action.dragAndDrop(source2, target).build().perform();
		Thread.sleep(200);
		action.dragAndDrop(source3, target).build().perform();
		Thread.sleep(200);
		action.dragAndDrop(source4, target).build().perform();
		Thread.sleep(200);
		action.dragAndDrop(source5, target).build().perform();
		
		}catch(Exception e){}
		

	}

}
