package makarand_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firsrAutomation {
	

	public static void main(String ar[]) throws InterruptedException
	{
		//---------Using Firefox ---------------
		
		/*WebDriver d1=new FirefoxDriver();
		d1.get("https://www.google.com/");
		
		Thread.sleep(10000);
		d1.manage().window().maximize();
		
		WebElement searchText= d1.findElement(By.id("lst-ib"));
		searchText.sendKeys("Automation is fun!!");
		
		WebElement searchButton=d1.findElement(By.name("btnG"));
		searchButton.click();
				
		d1.close();
		*/
		
		//---------Using chrome ---------------
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromeDriver.exe");
		WebDriver d2=new ChromeDriver();
		d2.get("https://www.google.com/");
		
		d2.manage().window().maximize();
		
		WebElement searchText1= d2.findElement(By.id("lst-ib"));
		searchText1.sendKeys("Automation is fun!!");
		
		WebElement searchButton1=d2.findElement(By.name("btnG"));
		searchButton1.click();
		Thread.sleep(10000); 
		
		d2.close();
		

	}

}

