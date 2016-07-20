package TestngAvinash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertySearchPom {
	
	WebDriver driver;
	
	
	
	public PropertySearchPom(WebDriver driver) {
		this.driver = driver;
	}

	public boolean checkListing(){
		WebElement CTproperty =driver.findElement(By.xpath("//*[@id='blueprint']/div[1]//h2[contains(text(),'Listings in 60012')]"));
		boolean flag=false;
		if(CTproperty!=null){
			flag=true;
		}
		
		return flag;
	}

}
