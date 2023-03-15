package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		        ChromeOptions options=new ChromeOptions(); 
		        options.addArguments("--remote-allow-origins=*"); 
		        options.addArguments("--disable-notifications");//to disable notification
				ChromeDriver driver=new ChromeDriver(options);   
				driver.get("https://www.redbus.in/"); 
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
				driver.findElement(By.xpath("//label[text()='FROM']/preceding-sibling::input")).sendKeys("chennai");
				driver.findElement(By.xpath("//li[@data-id='123']")).click();
				driver.findElement(By.xpath("//label[text()='TO']/preceding-sibling::input")).sendKeys("bangalore"); 
				driver.findElement(By.xpath("//li[@data-id='122']")).click();
                driver.findElement(By.xpath("//label[text()='Date']/preceding-sibling::input")).click();
                driver.findElement(By.xpath("//td[text()='16']")).click();
                driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
                String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']/span")).getText();
                System.out.println(text);
                driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]/preceding-sibling::label[@class='custom-checkbox']")).click();
                String bus = driver.findElement(By.xpath("(//div[@class='column-two p-right-10 w-30 fl'])[2]/div[@class='travels lh-24 f-bold d-color']")).getText();
                System.out.println(bus);
               System.out.println("Title: "+ driver.getTitle());  
               //driver.close();




	}

}
