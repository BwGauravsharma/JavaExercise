package TestngAvinash;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferListingPom {
	WebDriver driver;
	

	public OfferListingPom(WebDriver driver) {
		this.driver = driver;
	}

	public boolean OfferListing() {
		List<WebElement> offers = driver.findElements(By.xpath("//table/thead/tr/th/h3"));
		String offerName;
		boolean flag = false;
		for (WebElement offer : offers) {
			offerName = offer.getText();
			
			if (offerName.equalsIgnoreCase("7-DAY FREE TRIAL")) {
				System.out.println("free offer displayed");
				flag=true;
			} else if (offerName.equalsIgnoreCase("STANDARD")) {
				System.out.println("Standard offer displayed");
				flag=true;
			} else if (offerName.equalsIgnoreCase("DELUXE")) {
				System.out.println("Deluxe offer displayed");
				flag=true;
			} else if (offerName.equalsIgnoreCase("MLSENHANCED")) {
				System.out.println("MLS Enhanced offer displayed");
				flag=true;
			} else {
				System.out.println("Invalid offer displayed");
				return false;

			}
		}
		return flag;
	}
}
