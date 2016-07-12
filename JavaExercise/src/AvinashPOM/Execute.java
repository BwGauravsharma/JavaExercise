package AvinashPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Execute {

	public static void main(String[] args) throws InterruptedException {
		HomePagePom home;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		LoginPagePom login = new LoginPagePom(driver);
		login.entercredentials("guri10febf@gmail.com", "tribune1");
		home =login.clickLogin();
		String name =home.checkLoggin();
		System.out.println("Current logged in with  "+name);
		login=home.loggedout();
	}

}
//testdasdasdas
