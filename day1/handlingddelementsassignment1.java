package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingddelementsassignment1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sureka");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourcedd);
		sel.selectByIndex(4);
		WebElement marketingcampaigndd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2=new Select(marketingcampaigndd);
		dd2.selectByVisibleText("Automobile");
		WebElement ownershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3=new Select(ownershipdd);
		dd3.selectByValue("OWN_SCORP");
		driver.findElement(By.className("submitButton")).clear();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		

	}

}
