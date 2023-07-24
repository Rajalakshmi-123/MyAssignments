package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
  driver.get("http://leaftaps.com/opentaps/control/login");
  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
  driver.findElement(By.id("password")).sendKeys("crmsfa");
  driver.findElement(By.className("decorativeSubmit")).click();
  driver.findElement(By.linkText("CRM/SFA")).click();		
  driver.findElement(By.linkText("Leads")).click();
  driver.findElement(By.linkText("Create Lead")).click();
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajalakshmi");
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Annamalai");
  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RA");
  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSR");
  driver.findElement(By.id("createLeadForm_description")).sendKeys("My Assignements");
  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajalakshmi.annamalai@gmail.com");
  driver.findElement(By.name("submitButton")).click();
  
  String title = driver.getTitle();
  System.out.println(title);
  
  driver.findElement(By.className("subMenuButton")).click();
  
  WebElement comName = driver.findElement(By.id("createLeadForm_companyName"));
  comName.clear();
  //Thread.sleep(3000);
  comName.sendKeys("Leaf");
  
  WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
  firstName.clear();
  //Thread.sleep(3000);
  firstName.sendKeys("Raji");
  driver.findElement(By.className("smallSubmit")).click();
  
  String title1 = driver.getTitle();
  System.out.println(title1);
  
  
  

}
}