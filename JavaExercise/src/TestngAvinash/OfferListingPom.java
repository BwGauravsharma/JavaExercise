package TestngAvinash;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferListingPom {
	WebDriver driver;
	List<WebElement> offers = driver.findElements(By.xpath("//table/thead/tr/th/h3"));
	String offerName;

	public OfferListingPom(WebDriver driver) {
		this.driver = driver;
	}

	public boolean OfferListing() {
		boolean flag = false;
		for (WebElement offer : offers) {
			offerName = offer.getText();
			if (offerName.equalsIgnoreCase("free")) {
				System.out.println("free offer displayed");
				flag=true;
			} else if (offerName.equalsIgnoreCase("Standard")) {
				System.out.println("Standard offer displayed");
				flag=true;
			} else if (offerName.equalsIgnoreCase("Deluxe")) {
				System.out.println("Deluxe offer displayed");
				flag=true;
			} else if (offerName.equalsIgnoreCase("MLS Enhanced")) {
				System.out.println("MLS Enhanced offer displayed");
				flag=true;
			} else {
				System.out.println("Invalid offer displayed");
				break;

			}
		}
		return flag;
	}
}
