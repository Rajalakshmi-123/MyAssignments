package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notification");
	   
		ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    driver.manage().window().maximize();
 	    
 	    driver.get("https://login.salesforce.com/");
 	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
 		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");
 		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
 		
 		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
 		Set<String> windowHandles = driver.getWindowHandles();
 		System.out.println(windowHandles);
 		
 		List<String> allLinks = new ArrayList<String>(windowHandles);
 		driver.switchTo().window(allLinks.get(1));
 		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
 		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
 		
 		String title = driver.getTitle();
 		System.out.println("Title of the child window :" +title);
 		
 		Thread.sleep(3000);
 		driver.switchTo().window(allLinks.get(0));
 		driver.close();
 		
 		

	}

}
