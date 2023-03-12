package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead { 
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login"); 
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
		driver.findElement(By.linkText("Duplicate Lead")).click();  
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");  
		driver.findElement(By.id("createLeadForm_firstName")).clear(); 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("J"); 
		driver.findElement(By.className("smallSubmit")).click();    
		String t=driver.getTitle();  
	    System.out.println(t); 
	   
	}

}
