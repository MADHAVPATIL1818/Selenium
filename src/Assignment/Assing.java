package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
		driver.findElement(By.className("brand-more")).click();
		driver.findElement(By.xpath("//label[text()='Amazfit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Amazfit Unisex Green Bip U TFT-LCD Color Display Smartwatch']")).click();
		Thread.sleep(2000);

		

	}

}
