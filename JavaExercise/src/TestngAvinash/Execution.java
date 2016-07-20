package TestngAvinash;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution {
	private WebDriver driver;
	
	@BeforeTest
	public void ConfigBrowser(){
	driver = new FirefoxDriver();
	driver.get("http://forsalebyowner.tribstage.com/");
	driver.manage().window().maximize();
	HomePagePom ho;
	}
	
	
	@Test
	public void CheckpropertyListing(){
		boolean propertylisting;
		HomePagePom ho = new HomePagePom(driver);
		PropertySearchPom propertyserch=ho.SearchProperty();
		propertylisting=propertyserch.checkListing();
		Assert.assertTrue(propertylisting);
		System.out.println("property listed properly");
		}
	
	@Test
	public void CheckofferListing() throws InterruptedException{
		boolean offerlisting=false;
		HomePagePom ho = new HomePagePom(driver);
		ZipCodePage zp=ho.NavigateToListingPackagePage();
		OfferListingPom off=zp.EnterZipCodeInPackageAvilablePopUp();
		offerlisting=off.OfferListing();	
		Assert.assertTrue(offerlisting);
		System.out.println("offers listed properly");
		}
	
	
	
	@AfterTest
	public void CloseBrowser(){
		driver .quit();
		}
	

}