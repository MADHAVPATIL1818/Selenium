package BasicSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAllOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/signup");
		
		//identify the targeted element-month
		
		WebElement month = driver.findElement(By.id("month"));
		//Step 2 : Create the object of select class.
        ////Step 3 : pass the targeted element as an argumennt.
 
        Select s=new Select(month);
        
        //call the non-static method
        List<WebElement> alloptions = s.getOptions();
         
        //to get the ids of all month
        System.out.println(alloptions);
        
        for(WebElement a:alloptions) {
        	
        	//to get  text of all months
        	String text = a.getText();
        	System.out.println(text);
        }
        
         
		
	}

}
