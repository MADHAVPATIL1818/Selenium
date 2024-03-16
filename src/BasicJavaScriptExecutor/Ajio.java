package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://www.ajio.com/");
			
			//search for watches
			driver.findElement(By.name("searchVal")).sendKeys("wathces");
			
			//click on search icon
			driver.findElement(By.className("ic-search")).click();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			//js.executeScript("window.scrollBy(0,2000)");
			
			for(;;) {
				try {
					//click on watch image
					driver.findElement(By.cssSelector("Product image of DIOLLO Round Analogue Watch with Tang Buckle")).click();
					break;
				}catch(NoSuchElementException e) {
					js.executeScript("window.scrollBy(0,2000)");
				}
			
				
			}
				
			
			
			
			
	}

}
