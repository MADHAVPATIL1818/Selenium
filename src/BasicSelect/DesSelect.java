package BasicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		
		
		//Identify dropdown & perform clicking operation
		driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
		//Step 1 : Identify the targeted webelement- dropdown 
		WebElement dropdown = driver.findElement(By.id("superheros"));
		
		//Step 2 : Create the object of select class.
		//Step 3 : pass the targeted element as an argumennt.
		Select s = new Select(dropdown);
		
		//Step 4 : Call the non-static methods.
		//To select the elements by text
		s.selectByVisibleText("Batman");
		s.selectByVisibleText("Ant-Man");
		s.selectByVisibleText("Ghost Rider");
		Thread.sleep(4000);
		
		//To deselct all the elements which are select
		s.deselectAll();
		}

	}


