package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.myntra.com/");
      
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.myntra.com/"))
		{
		  System.out.println("true");  // condition satisified
		  
		}
		else {
			System.out.println("false"); // condition not satisified
			
		}
          System.out.println("good morning gokuldham");
	}

}
