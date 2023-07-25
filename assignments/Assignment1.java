package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Annamalai");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RA");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSR");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajalakshmi.annamalai@gmail.com");
		
		WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select op = new Select(drop);
		
		op.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
			
	}

}
