package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	@SuppressWarnings("unlikely-arg-type")
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
			driver.findElement(By.xpath("//li/a[contains(text(),'Find Leads')]")).click();  
			driver.findElement(By.xpath("//em[@class='x-tab-left']//span[text()='Email']")).click();  
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("testleaf@gmail.com"); 
			driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();  
			//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();  
			//WebElement first = driver.findElement(By.xpath("//div[@class='x-grid3-body']//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
			Thread.sleep(2000);
			WebElement first = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]")); 
			String text=first.getText(); 
            System.out.println(text); 
            Thread.sleep(2000);
             driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]")).click();
//            driver.executeScript("arguments[0].click()", name1);
            driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();  
            String title=driver.getTitle(); 
             if(title.contains("Duplicate Lead")) 
           { 
        	 driver.findElement(By.className("smallSubmit")).click();
        	 WebElement name2 = driver.findElement(By.id("viewLead_firstName_sp")); 
        	 String duplicate_name=name2.getText();
        	 if(duplicate_name.equals(text)) 
        	 {
        		 System.out.println("Duplicated");
        	 } 
        	 driver.close();
        		 
         }
         
			               

			}

		}


	
