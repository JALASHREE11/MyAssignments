package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		ChromeOptions options=new ChromeOptions(); 
		   options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver=new ChromeDriver(options);   
				driver.get("http://leaftaps.com/opentaps"); 
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement name=driver.findElement(By.id("username"));  
				name.sendKeys("demosalesManager"); 
				WebElement password=driver.findElement(By.id("password")); 
				password.sendKeys("crmsfa"); 
				driver.findElement(By.className("decorativeSubmit")).click(); 
				driver.findElement(By.partialLinkText("CRM")).click();  
				driver.findElement(By.linkText("Leads")).click();  
				driver.findElement(By.xpath("//li/a[contains(text(),'Find Leads')]")).click();  
				driver.findElement(By.xpath("//em[@class='x-tab-left']//span[text()='Phone']")).click();  
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("86107");  
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();   
				Thread.sleep(2000);
			    String lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();     
				System.out.println(lead); 
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click(); 
				//driver.executeScript("arguments[0].click();",findElement); 
				driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[contains(@class,'Dan')]")).click();
				driver.findElement(By.xpath("//li/a[contains(text(),'Find Leads')]")).click();   
				Thread.sleep(2000);
       		    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(lead);
//       			driver.executeScript("arguments[0].sendKeys(lead)",findElement2); 
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
				String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText(); 
//				if(text.equals("No records to display")) 
				 System.out.println(text);
				 driver.close();
				
				
				  
				
				
	}

}
