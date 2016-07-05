package ManasiSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBHomePage 

{
  WebDriver driver;
  //WebElement str;
  
  
 
 public FBHomePage (WebDriver driver)
 {
	 this.driver  = driver;
	 
 }
 
 public void DisplayName() throws InterruptedException
	
 {		
	 //Thread.sleep(3000);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	String str;
		str= driver.findElement(By.xpath("//*[@id='u_0_2']/div[1]/div[1]/div/a/span")).getText();
		System.out.println("My Name is:"+str);
		
	//System.out.println(str);
							
	}
 

}
