package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.co.in/");
	      
	    WebElement searchtf = driver.findElement(By.id("APjFqb"));
	    
	    Actions a=new Actions(driver);
	    //Right click on the webpage-contextclick()
	   // a.contextClick();
	    
	    
	    //Right Click on search tf-contextclick(webElement targeted)
	    a.contextClick(searchtf);
	    a.perform();
	}

}
