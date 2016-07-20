package TestngAvinash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZipCodePage {
	
	WebDriver driver;
	
	public ZipCodePage(WebDriver driver) {
		this.driver=driver;
	}

	public OfferListingPom EnterZipCodeInPackageAvilablePopUp(){
		WebElement ZipcodeTextField=driver.findElement(By.name("postalCode"));
		WebElement ZipcodeSubmitButton=driver.findElement(By.xpath("//*[@type='submit'][text()='Submit']"));
		ZipcodeTextField.sendKeys("90210");
		ZipcodeSubmitButton.click();
		return new OfferListingPom(driver);
	}
}
