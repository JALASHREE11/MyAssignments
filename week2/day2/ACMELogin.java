package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACMELogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver(); 
         driver.get("https://acme-test.uipath.com/login");  
         driver.manage().window().maximize(); 
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.findElement(By.xpath("//div[@class='form-group control-group']//input")).sendKeys("kumar.testleaf@gmail.com"); 
         driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12"); 
         driver.findElement(By.xpath("//form[@method='POST']/button")).click(); 
         String title = driver.getTitle();
         System.out.println(title);
          driver.findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right']/li)[3]")).click(); 
         driver.close(); 
	}

}
