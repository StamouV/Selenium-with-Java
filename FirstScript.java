package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaso\\Desktop\\selenium - essential packages\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Ξεχάσατε το όνομα χρήστη;"));
		
				
	
		
		
		
		
		
	}

}
