package ravindra_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTestExecution {
	static HomePagePOM home;

	
	public static void main(String[] args) {
			
		String path = "C:\\eclipse_1\\chrome\\";
		 System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 LoginPagePOM  login = new LoginPagePOM(driver);
		 login.addCredentials("guri10febf@gmail.com", "tribune1");
		 home = login.ClickLoginButton();
		 String HomeLabel = home.getHomeLabel();
		 if(HomeLabel.equals("Home0")){
			 System.out.println("Test case Passed");
		 }
		 else{
			 System.out.println("Test case Failed");
		 }
		 


	}
	
}
