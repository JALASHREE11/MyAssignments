package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		ChromeOptions options=new ChromeOptions(); 
        options.addArguments("--remote-allow-origins=*"); 
        options.addArguments("--disable-notifications");//to disable notification
		ChromeDriver driver=new ChromeDriver(options);   
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following-sibling::input")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@class='s-suggestion-container']/div[@aria-label='bags for boys']")).click(); 
//		String url = driver.getCurrentUrl(); 
//		if(url.contains("hyderabad")) 
//		{
		 String result =driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();  
		System.out.println(result);
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
        driver.findElement(By.xpath("//li[@id='p_89/Skybags']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
        driver.findElement(By.xpath("//span[@class='a-button-inner']//span[text()='Sort by:']")).click();
        driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']//a[text()='Newest Arrivals']")).click();
        String Name = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText(); 
        System.out.println(Name);
        String price = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText(); 
        Thread.sleep(2000);
        System.out.println(price);
        String title= driver.getTitle(); 
        System.out.println(title); 
        driver.close();
	}

}
