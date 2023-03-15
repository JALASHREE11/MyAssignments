package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGround_Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions(); 
		   options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver=new ChromeDriver(options); 
				driver.get("https://www.leafground.com/radio.xhtml"); 
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				  driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).click();
				  driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[2]/div[1]/div[2]/span[1]")).click();
				  driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]/span[1]")).click();
				  driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[1]/div[1]/div[2]/span[1]")).click(); 
				  System.out.println("Executed");
				  driver.close();
	}

}
