package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Abcd");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("RA");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("one.com");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("300000");
		
	    WebElement industry = driver.findElement(By.name("industryEnumId"));
	    Select option = new Select(industry);
	    option.selectByVisibleText("Computer Software");
	    
	    WebElement owner = driver.findElement(By.name("ownershipEnumId"));
	    Select options = new Select(owner);
	    options.selectByVisibleText("S-Corporation");
	    
	    WebElement source = driver.findElement(By.id("dataSourceId"));
	    Select op = new Select(source);
	    op.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
	    Select ops = new Select(marketing);
	    ops.selectByIndex(6);
	    
	    WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select out = new Select(state);
	    out.selectByValue("TX");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	}

}
