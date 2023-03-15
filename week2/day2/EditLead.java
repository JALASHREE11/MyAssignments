package week2.day2;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		  ChromeOptions options=new ChromeOptions(); 
		   options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver=new ChromeDriver(options); 
				driver.get("http://leaftaps.com/opentaps"); 
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement name=driver.findElement(By.id("username"));  
				name.sendKeys("DemoCSR"); 
				WebElement password=driver.findElement(By.id("password")); 
				password.sendKeys("crmsfa"); 
				driver.findElement(By.className("decorativeSubmit")).click(); 
				driver.findElement(By.partialLinkText("CRM")).click();  
				driver.findElement(By.linkText("Leads")).click();  
				driver.findElement(By.xpath("//li/a[contains(text(),'Find Le')]")).click();   
				Thread.sleep(2000);
				WebElement firstname=driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));  
				firstname.sendKeys("Kabilan");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();   
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();   
				String title = driver.getTitle(); 
				System.out.println(title);
				if(title.equals("View Lead | opentaps CRM")) 
				{ 
					driver.findElement(By.linkText("Edit")).click();
					driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear(); 
					driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Google");  
					driver.findElement(By.xpath("//input[@value='Update']")).click(); 
					driver.close();
					
				}

	}

}
