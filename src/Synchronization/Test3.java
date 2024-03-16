package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
		driver.get("https://www.myntra.com/");
		
		//enter wallet in search tf
		driver.findElement(By.className("desktop-searchBar")).sendKeys("wallet");
		//click on search icon
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		//fetch url of current page-wallet
		String walleturl = driver.getCurrentUrl();
		System.out.println(walleturl);
		
		//verify the url
		w.until(ExpectedConditions.urlToBe("https://www.myntra.com/wallet"));
		//w.until(ExpectedConditions.urlContains("https://www.myntra.com/wal"));
		//click on men
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
	}

}
