package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Annamalai");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options = new Select(source);
		
		options.selectByVisibleText("Employee");
		
	  WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	  Select op = new Select(mc);
	  
	  op.selectByValue("9001");
	  
	  WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	  
	  Select ops = new Select(ownership);
	  
	  ops.selectByIndex(3);
	  
	  WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	  
	  Select out = new Select(country);
	 
	  out.selectByVisibleText("India");
	  
	  driver.findElement(By.name("submitButton")).click();
	  
	  String title = driver.getTitle();
	  
	  System.out.println(title);
	  


}
}