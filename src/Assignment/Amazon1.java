package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		Thread.sleep(2000);
		//downcast
		JavascriptExecutor js=(	JavascriptExecutor) driver;
		
		//call executescript()
		js.executeScript("window.scrollBy(0,3000)");
		
		
	}

}