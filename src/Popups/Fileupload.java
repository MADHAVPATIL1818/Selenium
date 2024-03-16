package Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();	
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://demo.guru99.com/test/upload/");
		  
		  driver.findElement(By.id("file_wraper0")).click();
		  Thread.sleep(2000);
		  //To upload the file in runtime 
		 Runtime.getRuntime().exec("C:\\Users\\patil\\OneDrive\\Desktop\\R@.exe");
		              
	}

}
