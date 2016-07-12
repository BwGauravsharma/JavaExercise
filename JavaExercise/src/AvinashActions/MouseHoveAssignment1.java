package AvinashActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AllJarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS );
		driver.get("file:///C:/AutomationSukhi/Hover.html");
		Actions act = new Actions(driver);
		WebElement Home, About, Services, WebDevelopement;
		Home = driver.findElement(By.id("home"));
		About= driver.findElement(By.id("about"));
		Services= driver.findElement(By.id("services"));
		WebDevelopement = driver.findElement(By.xpath("//*[@id='services']/ul/li[text()='Web Development']"));
		
		act.moveToElement(Home).moveToElement(About).moveToElement(Services).perform();
		
		Thread.sleep(5000);
		act.moveToElement(Services).moveToElement(WebDevelopement).click().perform();
		
		

	}

}
