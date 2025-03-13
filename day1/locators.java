package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa"); 
	 
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.close();
		
		
	}

}
