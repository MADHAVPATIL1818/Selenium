package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      driver.findElement(By.className("desktop-searchBar")).sendKeys("Wrogn Shoe");
	      driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
	      
	      
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(0,1000)");
	      driver.findElement(By.xpath("(//h3[text()='WROGN'])[12]")).click();
	      
	      
	}

}
