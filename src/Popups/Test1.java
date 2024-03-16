package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();	
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://letcode.in/test");
		  //To click on dialogue
		  driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		  //TO click on simple alert
		//  driver.findElement(By.id("accept")).click();
		  //Click on Ok button
	//	  driver.switchTo().alert().accept();
		  
		  
		  
		  //To click on confirm alert button
		//  driver.findElement(By.id("confirm")).click();
		  //To click on ok button
		  //driver.switchTo().alert().accept();
		  
		  //To click on cancel Button
		  //driver.switchTo().alert().dismiss();
		  
		//  String text = driver.switchTo().alert().getText();
		  //System.out.println(text);
		  
		  
		  
		  //To click on Prompt button
		  driver.findElement(By.id("prompt")).click();
		  
		 driver.switchTo().alert().sendKeys("Madhav");
		  
		  driver.switchTo().alert().accept();
		  
		  
		  
		  
	}

}
