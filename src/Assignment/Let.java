package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Let {

	
	
		public static void main(String[]args) throws InterruptedException
		{
		//To launch the chrome browser
		WebDriver driver = new ChromeDriver();
				
		//To maximize the window
		driver.manage().window().maximize();
				
		//To launch https://letcode.in/test (letcode website link)
		driver.get("https://letcode.in/test");
		Thread.sleep(4000);
		
		//Identify dropdown & perform clicking operation
		driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
		//Step 1 : Identify the targeted webelement- dropdown 
		//WebElement dropdown = driver.findElement(By.id("superheros"));
		
		//Step 2 : Create the object of select class.
		//Step 3 : pass the targeted element as an argumennt.
	//	
	//Select s = new Select(dropdown);	
		//Step 4 : Call the non-static methods.
		//To select the elements by text
	//	s.selectByVisibleText("Batman");
		//s.selectByVisibleText("Ant-Man");
		//s.selectByVisibleText("Ghost Rider");
		//Thread.sleep(4000);
		
		//To deselct all the elements which are select
		//s.deselectAll();
		}
	
	
}
