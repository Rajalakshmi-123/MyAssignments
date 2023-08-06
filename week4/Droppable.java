package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/droppable");
	    driver.switchTo().frame(0);
	    WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));

	    Actions droppable = new Actions(driver);
	    droppable.dragAndDrop(src, dest).perform();
	}

}
