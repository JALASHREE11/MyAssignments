package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login"); 
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("demoSalesManager"); 
        driver.findElement(By.id("password")).sendKeys("crmsfa"); 
        driver.findElement(By.className("decorativeSubmit")).click();  
        driver.findElement(By.linkText("CRM/SFA")).click(); 
        driver.findElement(By.linkText("Leads")).click(); 
        driver.findElement(By.linkText("Create Lead")).click(); 
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini"); 
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ambani"); 
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mukesh");  
        WebElement source = driver.findElement(By.name("dataSourceId"));
        Select sec=new Select(source);
        sec.selectByIndex(4); 
        WebElement campign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select c=new Select(campign); 
        c.selectByVisibleText("Automobile"); 
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select o=new Select(ownership);  
        o.selectByValue("OWN_CCORP"); 
        driver.findElement(By.name("submitButton")).click(); 
        String str=driver.getTitle(); 
        if(str.equals("View Lead | opentaps CRM"))
        		driver.close();
	}

}
