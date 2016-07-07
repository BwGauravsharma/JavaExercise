package aashay_asg_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class FireFox_google_search 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\wires-0.6.2-win.exe");
		WebDriver driver = new MarionetteDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Automation is a fun");
		driver.findElement(By.name("btnG")).click();
		
	}

}
