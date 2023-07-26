package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
				
		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Raji");
		
		driver.findElement(By.name("lastname")).sendKeys("Annamalai");
		
		driver.findElement(By.name("reg_email__")).sendKeys("6655443322");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Pass@123");
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select option = new Select(date);
		
		option.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select options = new Select(month);
		
		options.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select ops = new Select(year);
		
		ops.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//label[text()='Female']//following-sibling::input")).click();
		
        
		
	}

}
