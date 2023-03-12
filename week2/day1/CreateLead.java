package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps"); 
		driver.manage().window().maximize(); 
		WebElement name=driver.findElement(By.id("username"));  
		name.sendKeys("DemoCSR"); 
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.partialLinkText("CRM")).click();  
		driver.findElement(By.linkText("Leads")).click();  
		driver.findElement(By.linkText("Create Lead")).click();   
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("D-Mart");   
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jala");   
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shree");    
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jalz");  
		driver.findElement(By.name("departmentName")).sendKeys("IT");  
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating a lead"); 
		driver.findElement(By.name("primaryEmail")).sendKeys("jalashree657657@gmail.com"); 
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId")); 
		Select province=new Select(State); 
		province.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();   
	    String f=driver.getTitle();  
	    System.out.println(f);

	}

}
