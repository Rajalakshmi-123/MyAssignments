package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	
		driver.get("https://jqueryui.com/selectable");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Actions selectable = new Actions(driver);
selectable.keyDown(Keys.CONTROL).click(item1).click(item4).click(item5).keyUp(Keys.CONTROL).perform();

	}

}
