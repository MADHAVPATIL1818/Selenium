package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AvoidNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          
		  //steps to avoid notification popup by using browserOptions class
		  
		  //step1: Create object of chromeOptions class
		  ChromeOptions op=new ChromeOptions();
		  
		  //step2: call addArgument(string argument)
		  op.addArguments("--disable-notifications");
		  
		  //stpe3:  we are passing reference of chromeoptions class into chromeoptions
			 WebDriver driver = new ChromeDriver(op);
			 driver.get("https://www.easemytrip.com/");

		  
		  
		  
	}

}
