package BasicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/signup");
		
		//identify the targeted element-month
		
		WebElement month = driver.findElement(By.id("month"));
		//Step 2 : Create the object of select class.
        ////Step 3 : pass the targeted element as an argumennt.
 
        Select s=new Select(month);
      //Step 4 : Call the non-static methods.

     //   s.isMultiple();
        System.out.println(   s.isMultiple());
        

	}

}
