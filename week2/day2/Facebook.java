package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Comment;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get(" https://en-gb.facebook.com/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		WebElement Create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));//attribute xpath
        Create.click(); 
        driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Oliver");//parent-child xpath
        driver.findElement(By.xpath("//input[contains(@aria-label,'Surna')]")).sendKeys("Smith");//partial attribute xpath
        driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9564321907");//elder to younger sibling xpath
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Ilu8321");//attribute xpath
        WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));//partial attribute xpath
        Select day=new Select(Day);  
        day.selectByIndex(11);  
        WebElement Month= driver.findElement(By.xpath("//select[@title='Month']"));//partial attribute xpath
        Select month=new Select(Month);  
        month.selectByVisibleText("Dec");  
        WebElement Year= driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@name='birthday_year']"));//partial attribute xpath
        Select year=new Select(Year);  
        year.selectByValue("2003");  
        driver.findElement(By.xpath("//input[@type='radio']/preceding-sibling::label[text()='Female']")).click();//preceding sibling xpath
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();   
        //Thread.sleep(450); 
        System.out.println("Comleted");
        //driver.close();
        
        
        
	}
	}


