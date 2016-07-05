package makarand_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class facebookLoginPOM
{
	
	WebDriver d1;
	public facebookLoginPOM(WebDriver d1)
	{
		this.d1=d1;
	}
	
	By username= By.name("email");
	By password= By.name("pass");
	By loginButton=By.id("u_0_m");
	
	public  facebookHomePagePOM LoginToFacebook(String uname, String pwd)
	{
				
		d1.findElement(username).sendKeys(uname);	
		d1.findElement(password).sendKeys(pwd);		
		d1.findElement(loginButton).click();
		
		d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return(new facebookHomePagePOM(d1));
		
	}


}