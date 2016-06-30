package newtestingManasi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jars Repository\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
	
		driver.findElement(By.id("lst-ib")).sendKeys("Manasi Mahabaleshwarkar");
		driver.findElement(By.className("sbico")).click();
		Thread.sleep(1000);
		
		driver.quit();
				
	}

}
