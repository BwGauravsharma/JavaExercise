package ravindra_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePOM{
	WebDriver driver;
	public HomePagePOM(WebDriver driver){
		this.driver = driver;
	}
	
	public String getHomeLabel(){
		String HomeLabel = driver.findElement(By.id("u_0_3")).getText();
		return HomeLabel;
	}

}
