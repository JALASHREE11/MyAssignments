package week2.day1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChromeDriver driver1=new ChromeDriver(); 
		driver1.get("https://www.facebook.com/"); 
		driver1.manage().window().maximize();    
		//to navigate to new tab comletely to new window
		driver1.navigate().to("https://platform.testleaf.com/#/");  
		driver1.manage().window().minimize();
		//to open in same broser in different tab
		//driver1.switchTo().newWindow(WindowType.TAB); 
		//to open in different window
		//driver1.switchTo().newWindow(WindowType.WINDOW);
		//driver1.get("https://web.whatsapp.com/"); 
		//driver1.close();
        //driver1.quit();
	}

}
