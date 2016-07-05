package makarand_selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookTestsClass{
	
	
	public static void main(String ar[])
	{
		//test to verify facebook login functionality
			System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromeDriver.exe");
			WebDriver d1=new ChromeDriver();
			
			d1.get("https://www.facebook.com/");
			d1.manage().window().maximize();
			
			facebookLoginPOM fb=new facebookLoginPOM(d1);	
			facebookHomePagePOM home;
			
			home=fb.LoginToFacebook("makdtest123@gmail.com", "testpwd");
			
			d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("After logging in...");
		
	//Here we are checking whether we have logged in to a right account 
	// by reading the name on profile button.
			
			String hm=home.checkHomeButton();
			
			if(hm.equals("Mak"))
			{
				System.out.println("Passed.! successful login.!");
			}
			
			home.logout();
			System.out.println("Logout successful!");
			d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			d1.close();
	}

}
