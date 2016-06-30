package newtestingManasi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium 

{

	public static void main(String[] args) 
	{
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("Automation is a fun");
//		driver.findElement(By.className("sbico")).click();
		
		//driver.findElement(By.xpath("//*[@id=sblsbb]/button/span")).click();
		
		

	}

}
