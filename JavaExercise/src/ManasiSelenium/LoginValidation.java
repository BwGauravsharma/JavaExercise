package ManasiSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.MarionetteDriver;

public class LoginValidation {


	
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver;
		
		
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\marionette\\wires-0.6.2-win.exe");
		driver = new MarionetteDriver();
		
		FBHomePage FB;
		LoginFBPage Flog = new LoginFBPage(driver);
		
		FB = Flog.loginWithUser("Mani8719@yahoo.co.in","rahuld");
		FB.DisplayName();
		
	   
	}

}
