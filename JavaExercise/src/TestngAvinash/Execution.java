package TestngAvinash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Execution {
	public static void main(String args[]){
WebDriver driver = new FirefoxDriver();
driver.get("https://forsalebyowner.tribstage.com/");
HomePagePom ho = new HomePagePom(driver);
ZipCodePage zp=ho.NavigateToListingPackagePage();
OfferListingPom off=zp.EnterZipCodeInPackageAvilablePopUp();
off.OfferListing();
}
}