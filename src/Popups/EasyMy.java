package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyMy {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();	
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://www.easemytrip.com/");
		  Thread.sleep(4000);
		  
		  //Steps to handel notification popup handling by Ronot class
		  
		  //create the object of robot class & handel the AWT exception
		  Robot r=new Robot();
		  
		  //To press key the button
		 r.keyPress(KeyEvent.VK_TAB);
		  
		  //To release key in the keyboard
		 r.keyRelease(KeyEvent.VK_TAB);
		  
		  
		  //To press key the button
		  r.keyPress(KeyEvent.VK_ENTER);
		  
		  //To release key in the keyboard
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  
		  
		  
		  
		  
	}

}
