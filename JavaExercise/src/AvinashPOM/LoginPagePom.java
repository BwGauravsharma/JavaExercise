package AvinashPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePom {
	
	WebDriver driver;

	public LoginPagePom(WebDriver driver){
		this.driver=driver;
	}
	
	public void entercredentials(String Username, String password){
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	public HomePagePom clickLogin(){
		driver.findElement(By.id("u_0_m")).click();
		return (new HomePagePom(driver));
	}
}
