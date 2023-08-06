package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LgDraggable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("https://leafground.com/drag.xhtml");
	    
	    WebElement drag = driver.findElement(By.id("form:conpnl_header"));
        Actions draggable = new Actions(driver);
        draggable.dragAndDropBy(drag, 75, 0).perform();
	}

}
