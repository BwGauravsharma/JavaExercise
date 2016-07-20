package TestngAvinash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePom {
	
	WebDriver driver;
	
	
	
	
	public HomePagePom(WebDriver driver) {
		this.driver=driver;
	}

	public PropertySearchPom SearchProperty(){
		WebElement homePageSearchTextBox = driver.findElement(By.id("search-box"));
		homePageSearchTextBox.sendKeys("90012");
		return new PropertySearchPom(driver);
		
	}
	
public ZipCodePage NavigateToListingPackagePage() throws InterruptedException{
		Thread.sleep(2000);
	    WebElement ListingPackagesLink = driver.findElement(By.xpath(".//*[@id='angular-root']/div[1]/header/div/div/div[2]/ul/li[2]/a"));	
		ListingPackagesLink.click();
		return new ZipCodePage(driver);
		
	}
	

}
