package ravindra_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testSelenium {

	public static void main(String[] args) {
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
//		driver.manage().window().maximize();
		// String path = "C:\\eclipse_1\\chrome\\";
		 //System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://www.google.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 WebElement searchBox = driver.findElement(By.className("gsfi"));
		 boolean a = searchBox.isEnabled();
		 System.out.println(a);
		
		 searchBox.sendKeys("Selenium as a fun ");
		 
	  driver.findElement(By.name("btnG")).click();
	
	}

}
