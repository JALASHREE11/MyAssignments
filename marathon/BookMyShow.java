package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		ChromeOptions options=new ChromeOptions(); 
        options.addArguments("--remote-allow-origins=*"); 
        options.addArguments("--disable-notifications");//to disable notification
		ChromeDriver driver=new ChromeDriver(options);   
		driver.get("https://in.bookmyshow.com/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//li/span[@class='sc-dBaXSw gYlrLO']")).click(); 
		String url = driver.getCurrentUrl(); 
		if(url.contains("hyderabad")) 
		{
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click(); 
		driver.findElement(By.xpath("//div/input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("RRR");
        driver.findElement(By.xpath("(//div/span[@class='sc-jhaWeW ChCae']/strong)[1]")).click();
        driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
        String theater = driver.findElement(By.xpath("(//div[@class='__title']/a)[1]")).getText(); 
        System.out.println(theater);
        driver.findElement(By.xpath("(//div[@class='info-section'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='venue-facilities']//div[text()='            Parking Facility        ']")).click();
        driver.findElement(By.xpath("//*[@d='M1 1l21 21M22 1L1 22']")).click();
        driver.findElement(By.xpath("(//div[@class='showtime-pill-container _available']/a)[1]")).click();
        driver.findElement(By.xpath("//ul[@id='popQty']/li[text()='1']")).click();
        driver.findElement(By.xpath("//div[@class='btn-bar']/div[@id='proceed-Qty']")).click();
        driver.findElement(By.xpath("(//div[@class='seatI']/a[@class='_available'])[1]")).click();
        driver.findElement(By.xpath("(//div/a[text()='Pay '])[1]")).click();  
        Thread.sleep(2000);
        String total = driver.findElement(By.xpath("//li[@class='_total-section']//span[@id='subTT']")).getText(); 
        Thread.sleep(2000);
        System.out.println(total); 
        driver.close();
        
        

	}

} 
}
