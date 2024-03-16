package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// 
		
			//To launch the chrome browser
		WebDriver driver = new ChromeDriver();
					
			//To maximize the window
			driver.manage().window().maximize();
					
			//To launch https://www.amazon.in/ (Amazon website link)
			driver.get("https://www.amazon.in/");

			
			//Step 1 : Identify the webelement on which we have to perform the action.
			WebElement Dropdown= driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
			Thread.sleep(2000);
			

			//Step 2 : Create object of Actions Class.
			//Step 3 : Pass web driver reference as an argument to Actions Constructor.
			Actions a = new Actions(driver);
			
			//Step 4 : Mouse over on Dropdown icon-->moveToElement(WebElementTargeted)
			a.moveToElement(Dropdown);
			a.perform();
			Thread.sleep(4000);
			
			//To Identify & click on to change country & region opetion
			driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]")).click();
			Thread.sleep(2000);
			
			//Step 1 : Identify the targeted webelement- dropdown
			WebElement dropdown = driver.findElement(By.cssSelector("[class='a-icon a-icon-dropdown']"));
			
				
			//Step 2 : Create the object of select class.
			//Step 3 : pass the targeted element as an argumennt.
			Thread.sleep(2000);
			Select s = new Select(dropdown);
			
			Thread.sleep(2000);	
			//Step 4 : Call the non-static methods.
			//To select the Canada
			s.selectByVisibleText("Canada");
			
				



	}

}
