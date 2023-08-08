package assignments.week4;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    driver.manage().window().maximize();
 	    
 	    driver.get("https://www.snapdeal.com/");
 	    driver.findElement(By.id("pushDenied")).click();
 	    
 	    WebElement mouseHover = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
        Actions obj = new Actions(driver);
        obj.moveToElement(mouseHover).perform();
        
        driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
        WebElement num = driver.findElement(By.xpath("(//div[text()='5116'])[3]"));
        String count  = num.getText();
        System.out.println(count);
        
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        
        driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
        driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
        
        driver.findElement(By.name("fromVal")).clear();
        driver.findElement(By.name("fromVal")).sendKeys("550");
        driver.findElement(By.name("toVal")).clear();
        driver.findElement(By.name("toVal")).sendKeys("800");
        driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
        WebElement js = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
        driver.executeScript("arguments[0].click();", js);
        
        WebElement mouseHover2 = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
        Actions obj2 = new Actions(driver);
        obj2.moveToElement(mouseHover2).perform();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//div[@supc='SDL901001171'])[2]")).click();  
        
        
        WebElement cost = driver.findElement(By.xpath("//span[text()='649 ']"));
        String price = cost.getText();
        System.out.println(price);
        
        WebElement percentage = driver.findElement(By.xpath("(//span[text()='35% Off'])[1]"));
        String discount = percentage.getText();
        System.out.println(discount);
        
        File src = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snap.img1.png");
        FileUtils.copyFile(src, dest);
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
        
        
        driver.quit();
            								
        
	}

}
