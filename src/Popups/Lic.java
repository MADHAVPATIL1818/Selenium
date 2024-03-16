package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();	
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://licindia.in/");
		  
		  driver.findElement(By.xpath("//button[text()='Close']")).click();
		  
		  //To click on pay premium online
		  driver.findElement(By.xpath("//span[text()=' Pay Premium ']")).click();
		  
		 String text = driver.switchTo().alert().getText();
		 System.out.println(text);
		 
		 
		 //To click on OK button
		// driver.switchTo().alert().accept();
		 
		 
		 //To click on cancel button
		 driver.switchTo().alert().dismiss();
		  
		  
		  
	}

}
