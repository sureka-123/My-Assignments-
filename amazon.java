package marathon;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		//launch browser
ChromeDriver driver=new ChromeDriver();
//load the url
driver.get("https://www.amazon.in/");
//maximize the window
driver.manage().window().maximize();
//implicity wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//search "Bags for boys" in search box
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
//search icon click
driver.findElement(By.id("nav-search-submit-button")).click();
//print the total number ofresults
String totalresults = driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
System.out.println(totalresults);
// Select the first 2 brands in the left menu
driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
//click sortby
driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
//choose new arrivels
driver.findElement(By.xpath("//li[text()='Newest Arrivals']")).click();
//choose first bag name
String firstbagname = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-color-base']")).getText();
System.out.println("first bag name");
//  choose first bag discount price
String firstbagdiscountprice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
System.out.println(firstbagdiscountprice);
//get the title
String title = driver.getTitle();
System.out.println(title);







	}

}
