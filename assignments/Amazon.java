package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		String text = result.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
        driver.findElement(By.xpath("//span[text()='Skybags'][1]")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
        
        WebElement result1 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        String name = result1.getText();
        System.out.println("Name of the bag is " +name);
        
        WebElement result2 = driver.findElement(By.xpath("//span[text()='997']"));
		String amt = result2.getText();
		System.out.println("Cost is " +amt);
		
		String title = driver.getTitle();
		System.out.println("Title of the page is - "+title);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
