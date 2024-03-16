package BasicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookVisibleText {

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
        
        //call the non-static method-  selectbyvisivleText()---to select the text
       // s.selectByVisibleText("Jan");
          
      //To select the element by attribute value.
       //  s.selectByValue("3");
        
      //To select the element by index value(index starts from 0)
      s.selectByIndex(1);
	}

}
