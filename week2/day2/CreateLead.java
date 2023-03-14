package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChromeDriver driver=new ChromeDriver();  
		driver.manage().window().maximize(); 
		driver.get("http://leaftaps.com/opentaps");
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demoSalesManager");  
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa"); 
		WebElement login=driver.findElement(By.xpath("//input[@class='decorativeSubmit']")); 
		login.click(); 
		//driver.findElement(By.xpath("(//a[contains(@href,'crmsfa')])[2]")).click();  
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();  
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
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
