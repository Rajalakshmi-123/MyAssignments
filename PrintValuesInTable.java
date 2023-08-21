package aasignments.week6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesInTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    driver.manage().window().maximize();
 	    driver.get("https://html.com/tags/table/");

 	    List<WebElement> table1row = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
	    int t1row = table1row.size();
	    System.out.println("No of rows in table1: " + t1row);
	    
	    List<WebElement> table1col = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
	    int t1col = table1col.size();
	    System.out.println("No of cols in table1: " + t1col);
	    
	    for (int i = 1; i <= t1row; i++) {
	    	
	    	for (int j = 1; j <= t1col; j++) {
	    		
	    		String text = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
			}
			
		}
	    
	    System.out.println("*************************************");
	    
	    
	    List<WebElement> table2row = driver.findElements(By.xpath("//div[@class='related-pages']/table/tbody/tr"));
 	    int t2row = table2row.size();
 	    System.out.println("No of rows in table2: " + t2row);
 	    
 	    List<WebElement> table2col = driver.findElements(By.xpath("//div[@class='related-pages']/table/tbody/tr/th"));
 	    int t2col = table2col.size();
 	    System.out.println("No of cols in table2: " + t2col);
 	    
 	    for (int i = 1; i <t2row; i++) {
 	    	
 	    	for (int j = 1; j <= t2col; j++) {
				
			String text1 = driver.findElement(By.xpath("//div[@class='related-pages']/table/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				System.out.println(text1);
			}
			
		}
	    		
	}

}
