package ravindra_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTestExecution {

	WebDriver driver;
	LoginPagePOM login;
	HomePagePOM home;
	public static void main(String[] args) {
		Config1();
		TestLogin();
	}

	static void Config1(){
		String path = "C:\\eclipse_1\\chrome\\";
		 System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	public static void TestLogin(){
		
		
	}
	
}
