package aashay_asg_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBHomepagePageObject {
	
	private WebDriver driver;
	public String str;
	
	public FBHomepagePageObject(WebDriver driver){
		
		this.driver = driver;
	}

	public String ProfileUSer(String username)
	{
		System.out.println("FB Home page");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);		
		str = driver.findElement(By.xpath("//*[@id='u_0_2']/div[1]/div[1]/div/a")).getText();
	
		System.out.println("name is "+str);
		return str;
						
	}
	
}
