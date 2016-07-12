package aashay_ActionMenus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_drag_drop {
	
	public static void main(String args [])
	{
		WebDriver driver;
		WebElement e1,e2,e3,e4,e5,d1;
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Aashay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Aashay/Selenium/Actions%20Menus%20-%20Selenium/drag-and-drop.html");
		
		Actions action = new Actions(driver);
		
		d1 = driver.findElement(By.id("obliterate"));
		e1 = driver.findElement(By.id("one"));
		e2 = driver.findElement(By.id("two"));
		e3 = driver.findElement(By.id("three"));
		e4 = driver.findElement(By.id("four"));
		e5 = driver.findElement(By.id("five"));
		
		
		action.dragAndDrop(e1, d1).perform();
		action.dragAndDrop(e2, d1).perform();
		action.dragAndDrop(e3, d1).perform();
		action.dragAndDrop(e4, d1).perform();
		action.dragAndDrop(e5, d1).perform();
		
		
		
	}

}
