package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rajalakshmi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='11754']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("View Lead"))
				{
			System.out.println("Title is correct and verified");
				}
			else {System.out.println("Title is incorrect");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement company = driver.findElement(By.id("updateLeadForm_companyName"));
		company.clear();
		Thread.sleep(3000);
		company.sendKeys("TestLeaf");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	WebElement where = driver.findElement(By.id("viewLead_companyName_sp"));
		
	boolean isVisible  = where.isDisplayed();
	
	System.out.println(isVisible);
	
	Thread.sleep(3000);
		
		driver.close();
		
		
		

	}

}
