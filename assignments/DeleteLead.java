package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		
ChromeDriver driver = new ChromeDriver();

		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("7397425271");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		WebElement captureId = driver.findElement(By.partialLinkText("10136"));
		String text = captureId.getText();
		System.out.println (text);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10136");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		Thread.sleep(1000);
		WebElement msg = driver.findElement(By.xpath("//div[text()='No records to display']"));
        boolean isVisible = msg.isDisplayed();
        System.out.println(isVisible);
        
        Thread.sleep(2000);
        driver.close();
        
	}


}
