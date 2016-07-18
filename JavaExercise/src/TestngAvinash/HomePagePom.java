package TestngAvinash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePom {
	
	WebDriver driver;
	
	WebElement homePageSearchTextBox = driver.findElement(By.id("search-box"));
	WebElement ListingPackagesLink = driver.findElement(By.linkText("Listing Packages"));
	
	public HomePagePom(WebDriver driver) {
		this.driver=driver;
	}

	public PropertySearchPom SearchProperty(){
		
		homePageSearchTextBox.sendKeys("90012");
		return new PropertySearchPom(driver);
		
	}
	
public ZipCodePage NavigateToListingPackagePage(){
		
		ListingPackagesLink.click();
		return new ZipCodePage(driver);
		
	}
	

}
