package Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerApp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();	
	     
		  driver.get("https://demo.vtiger.com/vtigercrm/");
		  
		  //To sign-in
		  driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		  //To click on 3 dash
		  driver.findElement(By.id("appnavigator")).click();
		  
		  //To mouse hover on marketing
		 WebElement marketing = driver.findElement(By.cssSelector("span[class='app-icon-list fa fa-users']"));
		  Actions a=new Actions(driver);
		  a.moveToElement(marketing);
		  a.perform();
		  
		  //To click on contact
		  driver.findElement(By.xpath("(//span[text()=' Contacts'])[1]")).click();
		  //To click on add to contact
		  
		 driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		 
		 //To scroll down
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
		//To click on upload button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Upload']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\patil\\OneDrive\\Desktop\\vtiger.exe");
		
		
		
		
	
		 
		
	      
		 
		 
		  
		  

	}

}
