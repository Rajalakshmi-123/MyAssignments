package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lgdroppable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("https://leafground.com/drag.xhtml");
	    
	    WebElement src = driver.findElement(By.id("form:drag_content"));
        WebElement dest = driver.findElement(By.id("form:drop_content"));
        
        Actions drop = new Actions(driver);
        drop.dragAndDrop(src, dest).perform();
        
	}

}
