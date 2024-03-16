package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Assignment.Myntra;

public class Explicit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//step1: Create object of webDriverwait class &
		//in webDriverwait Constructor pass the arguments--webDriver reference & duration
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(2));
		
		driver.get("https://www.myntra.com/");
		String title = driver.getTitle();
		
		w.until(ExpectedConditions.titleIs("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"));
		System.out.println(title);
		System.out.println("gm");
 	}

}
