package ManasiSelenium;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFBPage 
{
	WebDriver driver;
	WebElement str;
	
	
	public LoginFBPage (WebDriver driver) 
	{
		this.driver = driver;
	}
	public FBHomePage loginWithUser(String Uname, String Pass1) 
	{

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(Uname);
		
		//driver.findElement(nextButton).click();
		driver.findElement(By.id("pass")).sendKeys(Pass1);
		driver.findElement(By.id("loginbutton")).click();
		
		return (new FBHomePage(driver));
	}
	
	/*public void DisplayName(FBPage)
	
	  {
		
			str= driver.findElement(By.xpath("//*[@id='u_0_2']/div[1]/div[1]/div/a/span"));
			System.out.println("The user name is:"+str.getText());
			
		//System.out.println(str);
								
		}*/
		

	
	
	

}
