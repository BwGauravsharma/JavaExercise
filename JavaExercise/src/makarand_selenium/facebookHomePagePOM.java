package makarand_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookHomePagePOM {
	
 WebDriver d1;
 
 public facebookHomePagePOM(WebDriver d1)
 {
	 this.d1=d1;
 }

  public String checkHomeButton()
  {
	  String homeButtonText;
	  By homeButton=By.className("_2s25");
	  
	  homeButtonText= d1.findElement(homeButton).getText();
	  System.out.println("Name is "+homeButtonText);
	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  return  (d1.findElement(homeButton).getText());
	  //return homeButtonText;
  }
  
  public void logout()
  {
	  
	  By arrow=By.id("pageLoginAnchor");
	  By logoutButton =By.className("_54nc");
	  
	  d1.findElement(arrow).click();
	  d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  d1.findElement(logoutButton).click();
  }

}