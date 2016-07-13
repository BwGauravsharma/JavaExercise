package aashay_asg_4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.*;

public class FBLoginPageObject {
	
	private WebDriver driver;
	
	public FBLoginPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/*	public FBLoginPageObject()
	{
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\wires-0.6.2-win.exe");
		driver = new MarionetteDriver();
		driver.get("http://www.facebook.com");
	}*/
	
	public FBHomepagePageObject loginToFB(String username, String password)
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_m")).click();
	
		
		return (new FBHomepagePageObject(driver));
	}


}
