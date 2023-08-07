package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LgWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    driver.manage().window().maximize();
 	    driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
 	    
 	    driver.findElement(By.xpath("//span[text()='Open']")).click();
 	    Set<String> windowHandles = driver.getWindowHandles();
 	    System.out.println(windowHandles);
 	    Thread.sleep(2000);
 	    List<String> allLinks =new ArrayList<String>(windowHandles);
 	    driver.switchTo().window(allLinks.get(1));
 	    driver.close();
 	    Thread.sleep(1000);
 	    
 	    driver.switchTo().window(allLinks.get(0));
 	    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
 	    Set<String> windowHandles2 = driver.getWindowHandles();
	    System.out.println(windowHandles2);
 	    Thread.sleep(2000);
        List<String> allLinks2  = new ArrayList<String>(windowHandles2);
 	    driver.switchTo().window(allLinks2.get(1));
 	    driver.close();
 	    Thread.sleep(3000);
 	    driver.switchTo().window(allLinks2.get(2));
 	    driver.close();
	    Thread.sleep(3000);
	    
	    driver.switchTo().window(allLinks.get(0));
	    driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	    Set<String> windowHandles3 = driver.getWindowHandles();
	    System.out.println(windowHandles3);
	    List<String> allLinks3  = new ArrayList<String>(windowHandles3);
	    driver.switchTo().window(allLinks3.get(1));
	    driver.close();
	    Thread.sleep(1000);
	    driver.switchTo().window(allLinks3.get(2));
	    driver.close();
	    Thread.sleep(1000);
	    driver.switchTo().window(allLinks3.get(3));
	    driver.close();
	    Thread.sleep(1000);
	    
	    driver.switchTo().window(allLinks.get(0));
	    driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
	    Thread.sleep(3000);
	    Set<String> windowHandles4 = driver.getWindowHandles();
	    System.out.println(windowHandles4);
	    List<String> allLinks4  = new ArrayList<String>(windowHandles4);
	    driver.switchTo().window(allLinks4.get(1));
	    driver.close();
	    Thread.sleep(1000);
	    driver.switchTo().window(allLinks4.get(2));
	    driver.close();
	    Thread.sleep(1000);
	    
        driver.quit();
 	    }

}
