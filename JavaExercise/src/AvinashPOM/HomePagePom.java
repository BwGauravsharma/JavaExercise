package AvinashPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePom {

	WebDriver driver;

	public HomePagePom(WebDriver driver){
		this.driver=driver;
	}

	public String checkLoggin(){
	String name=driver.findElement(By.xpath(".//*[@id='u_0_2']/div[1]/div[1]/div/a/span")).getText();
	return name;		
	}
	public void loggedout() throws InterruptedException{
		driver.findElement(By.id("pageLoginAnchor")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();;
	}
}
