package BasicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LetCodeDiselectd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		Thread.sleep(3000);
		
		//Identify dropdown & perform clicking operation
		driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
        

		//Step 1 : Identify the targeted webelement- dropdown 
		WebElement dropdown = driver.findElement(By.id("superheros"));
		
		//Step 2 : Create the object of select class.
		//Step 3 : pass the targeted element as an argumennt.
        Select s=new Select(dropdown);
        
      //Step 4 : Call the non-static methods.
    	//To select the Ant_Man
        s.selectByVisibleText("Ant-Man");
        Thread.sleep(2000);
        
      //To deselect the Ant_Man by text
     //   s.deselectByVisibleText("am");
        
      //To deselct by value
    	s.deselectByValue("am");

        
        


		

        
        
        
	}

}
