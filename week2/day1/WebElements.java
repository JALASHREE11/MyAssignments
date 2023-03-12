package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements { 
	public static void main(String[] args) 
	{ 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps"); 
		driver.manage().window().maximize(); 
		WebElement name=driver.findElement(By.id("username"));  
		name.sendKeys("DemoCSR"); 
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.partialLinkText("CRM")).click();  
		//driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");   
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");  
		//driver.findElement(By.className("loginButton")).click();  
		driver.findElement(By.linkText("Leads")).click();  
		driver.findElement(By.linkText("Create Lead")).click();   
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("D-Mart");   
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jala");   
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shree");   
		driver.findElement(By.name("submitButton")).click();   
	    String f=driver.getTitle();  
	     String d="View Lead | opentaps CRM";
	    if(f.equals(d))
		driver.close();
		
		
		
		
	}
	

}
