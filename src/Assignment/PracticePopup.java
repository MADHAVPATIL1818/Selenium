package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();	
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://letcode.in/test");
		  //To click on dialog
		  driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		  //To click on simple
		  //driver.findElement(By.id("accept")).click();
		  
		  //To click on ok of popup
		//  Thread.sleep(2000);
		  //driver.switchTo().alert().dismiss();
		  
		  
		  
		  //To click on confirm alert
		//  driver.findElement(By.id("confirm")).click();
		  //To click on ok button
		  //driver.switchTo().alert().accept();
		  //To click on cancel button
		 // driver.switchTo().alert().dismiss();
		  
		  //To get text
		//  String text = driver.switchTo().alert().getText();
		  //System.out.println(text);
		  
		  
		  
		  //To click prompt button
		  driver.findElement(By.id("prompt")).click();
		  //To enter name 
		  driver.switchTo().alert().sendKeys("Madhav");
		  driver.switchTo().alert().accept();
		  
		  
		  
		  
		  
		  
	}

}
