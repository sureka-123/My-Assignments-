package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccountassignment1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("sureka");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industrydd = driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(industrydd);		
		sel.selectByValue("IND_SOFTWARE");
		WebElement ownershipdd = driver.findElement(By.name("ownershipEnumId"));
		Select dd2=new Select(ownershipdd);
		dd2.selectByVisibleText("S-Corporation");
		WebElement sourcedd = driver.findElement(By.id("dataSourceId"));
		Select dd3=new Select(sourcedd);
		dd3.selectByValue("LEAD_EMPLOYEE");
WebElement Marketingcampaigndd	 = driver.findElement(By.id("marketingCampaignId"));
Select dd4=new Select(Marketingcampaigndd);
dd4.selectByIndex(6);
WebElement stateorprovinceid = driver.findElement(By.id("generalStateProvinceGeoId"));
Select dd5=new Select(stateorprovinceid);
dd5.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
driver.close();





		
		

	}

}
