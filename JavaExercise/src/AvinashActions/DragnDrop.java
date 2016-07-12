package AvinashActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AllJarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS );
		driver.get("file:///C:/AutomationSukhi/drag-and-drop.html");
		Actions act = new Actions(driver);
		WebElement One, two, three, four,five,MainBlock;
		One = driver.findElement(By.id("one"));
		two= driver.findElement(By.id("two"));
		three= driver.findElement(By.id("three"));
		four = driver.findElement(By.id("four"));
		MainBlock= driver.findElement(By.id("obliterate"));
		five= driver.findElement(By.id("five"));
		/*act.clickAndHold(One).moveToElement(MainBlock).release(One).
		clickAndHold(two).moveToElement(MainBlock).release(two).
		clickAndHold(three).moveToElement(MainBlock).release(three).
		clickAndHold(four).moveToElement(MainBlock).release(four).
		clickAndHold(five).moveToElement(MainBlock).release(five).perform();*/
		
		act.dragAndDrop(One, MainBlock).
		dragAndDrop(two, MainBlock).
		dragAndDrop(three, MainBlock).
		dragAndDrop(four, MainBlock).
		dragAndDrop(five, MainBlock).perform();
		
		

	}


	}


