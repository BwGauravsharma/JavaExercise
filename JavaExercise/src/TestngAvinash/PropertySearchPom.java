package TestngAvinash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertySearchPom {
	
	WebDriver driver;
	
	WebElement pagenation =driver.findElement(By.xpath(""));
	
	public PropertySearchPom(WebDriver driver) {
		this.driver = driver;
	}

	public boolean checkListing(){
		boolean flag=false;
		
		return flag;
	}

}
