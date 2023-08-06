package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    
	    driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
	    
	    Thread.sleep(1000);
	    driver.switchTo().frame(0);
	    WebElement click1 = driver.findElement(By.id("Click"));
	    click1.click();
	    System.out.println(click1.getText());
	    
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(1000);
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement click2 = driver.findElement(By.id("Click"));
		click2.click();
		System.out.println(click2.getText());
		
	    driver.switchTo().defaultContent();



	}

}
