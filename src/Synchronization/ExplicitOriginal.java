package Synchronization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitOriginal {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//step1: Create object of webDriverwait class &
		//in webDriverwait Constructor pass the arguments--webDriver reference & duration
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(2));
		
		driver.get("https://www.myntra.com/");
		
		String url = driver.getCurrentUrl();
		//step2: call until()
		//step3: pass the predicate functions(condition method) as argument inside the until method
		w.until(ExpectedConditions.urlToBe("https://www.myntra.com/"));
		
		System.out.println(url);
		System.out.println("good morning");
		
	}

}
