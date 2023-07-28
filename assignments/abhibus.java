package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abhibus {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
        driver.findElement(By.id("source")).sendKeys("Chennai");		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.linkText("Search")).click();
		
		WebElement heading = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']"));
		String text = heading.getText();
		System.out.println(text);
		
		driver.findElement(By.id("bustypeSLEEPER")).click();
		WebElement count = driver.findElement(By.xpath("//p[text()='27 Seats Available']"));
        String seat = count.getText();
        System.out.println(seat);
        
        driver.findElement(By.xpath("//span[@class='book'][1]")).click();
        driver.findElement(By.xpath("//a[@class='tooltip tooltipstered'][1]")).click();
        
        WebElement seat1 = driver.findElement(By.id("seatnos"));
		String name = seat1.getText();
		System.out.println(name);
		
		WebElement cost = driver.findElement(By.id("ticketfare"));
		String amt = cost.getText();
		System.out.println(amt);
		
		Thread.sleep(1000);
		WebElement boarding = driver.findElement(By.id("boardingpoint_id"));
		Select bp = new Select(boarding);
		bp.selectByIndex(16);
		
		Thread.sleep(1000);
		WebElement dropping = driver.findElement(By.id("droppingpoint_id"));
		Select dp = new Select(dropping);
		dp.selectByIndex(3);
		
		Thread.sleep(1000);
        String title = driver.getTitle();
        System.out.println(title);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
