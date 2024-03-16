package BasicJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();		
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		//identify disable text field
		WebElement textfield = driver.findElement(By.cssSelector("input[class='form-control']"));
		
		//step1: downcast javascriptexecute to access executescript and 
		JavascriptExecutor js=(JavascriptExecutor )driver;
		
		//step2:call the method executescript(string script,object)
		js.executeScript("arguments[0].value='pune'",textfield);
		
		
	}

}
