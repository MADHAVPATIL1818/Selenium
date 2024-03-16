package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      
	      Thread.sleep(2000);
	      
	      //To click on google 
	      driver.findElement(By.className("gb_d")).click();
	      
	   //   driver.switchTo().frame("app");
	     
	      
	      
	      driver.switchTo().frame("");
	      
	      //To click on You tube
	      driver.findElement(By.xpath("//span[text()='YouTube']")).click();
	      
	}

}
