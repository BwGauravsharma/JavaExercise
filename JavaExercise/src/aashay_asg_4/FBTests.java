package aashay_asg_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class FBTests {
	
	static FBLoginPageObject loginPOM;
	static FBHomepagePageObject ProfilePOM;
	
		
	public static void main(String args[])
	{
		String str = null;
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\wires-0.6.2-win.exe");
		driver = new MarionetteDriver();
		driver.get("http://www.facebook.com");
				
		loginPOM = new FBLoginPageObject(driver);
		loginPOM.loginToFB("ctregn@yahoo.com", "Tribune1");
		
		ProfilePOM = new FBHomepagePageObject(driver); 
		ProfilePOM.ProfileUSer(str);
		
		
		
				
		
		
		
	}
	

}
