package ravindra_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	
	WebDriver driver;
	public LoginPagePOM(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePagePOM verifylogin(String email, String pwd){
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_m")).click();
		return new HomePagePOM(driver);
	}
	

}
