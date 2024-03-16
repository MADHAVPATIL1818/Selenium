package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://letcode.in/test");
		//click on edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//identify disable text field
		WebElement textfield = driver.findElement(By.id("noEdit"));
		
		//step1: downcast javascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//step2: call executescript()
		js.executeScript("arguments[0].value='Madhav'", textfield);
		
	}

}
