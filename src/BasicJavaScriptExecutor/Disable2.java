package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
			
			//To click on first link
			driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
			
			WebElement button = driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
            
			 JavascriptExecutor js=( JavascriptExecutor )driver;
			 
			 js.executeScript("arguments[0].click()", button);
	}

}
