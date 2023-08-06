package week4.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
        
		ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    driver.manage().window().maximize();
 	    
 	    driver.get("https://www.amazon.in/");
 	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
 	    
 	    WebElement text = driver.findElement(By.xpath("//span[text()='44,699']"));
 	    String price = text.getText();
 	    System.out.println(price);
 	    
 	    //WebElement mouseHover = driver.findElement(By.xpath("//span[text()='2.2 out of 5 stars']"));
 	    //Actions obj = new Actions(driver);
 	    //obj.moveToElement(mouseHover).perform();
 	    
 	    
 	    WebElement text2 = driver.findElement(By.xpath("//span[text()='6']"));
 	    String ratings = text2.getText();
 	    System.out.println(ratings);
 	    
 	    Thread.sleep(3000);
 	    
 	    driver.findElement(By.xpath("//span[contains(text(),'Morning Mist')]")).click();
 	    
 	    File scr = driver.getScreenshotAs(OutputType.FILE);
 	    File dest = new File("./snap.img.png");
 	    FileUtils.copyFile(scr, dest);
 	    
 	    Set<String> windowHandles = driver.getWindowHandles();
 	    List<String> allLinks = new ArrayList<String>(windowHandles);
 	    driver.switchTo().window(allLinks.get(1));
 	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
 	    Thread.sleep(1000);
 	    
 	   
 	    WebElement total = driver.findElement(By.xpath("//span[text()='₹44,699.00']"));
 	    String cart = total.getText();
 	    System.out.println(cart);
 	    boolean isVisible = total.isDisplayed();
 	    System.out.println(isVisible);
 	    
 	    Thread.sleep(1000);
 	    driver.quit();
 	    
 	    
	}

}
