package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login"); 
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement name=driver.findElement(By.id("username"));  
		name.sendKeys("DemoCSR"); 
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.partialLinkText("CRM")).click();  
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();  
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();      
		driver.findElement(By.id("firstNameField")).sendKeys("Jala");   
		driver.findElement(By.id("lastNameField")).sendKeys("Shree");    
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jalz");   
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("shre");  
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");  
		driver.findElement(By.name("description")).sendKeys("Creating a Contact"); 
		driver.findElement(By.xpath("//td[@colspan='4']/input[@id='createContactForm_primaryEmail']")).sendKeys("jalashree657657@gmail.com"); 
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")); 
		Select province=new Select(State); 
		province.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();  
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[contains(@href,'crms')]")).click(); 
		driver.findElement(By.xpath("//tr//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("(//tr//textarea)[2]")).sendKeys("Updated one");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
	    String f=driver.getTitle();  
	    System.out.println(f); 
	    //driver.close();

	}

}
