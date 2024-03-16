package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/");
	      
	      WebElement men = driver.findElement(By.xpath("//span[text()='MEN']"));
          
	      Actions a=new Actions(driver);
	      
	      //step1: press control button
	      a.keyDown(Keys.CONTROL).perform();
	      
	      //Step2: clcik on men
	      a.click(men).perform();
	      
	      //step3: release control button
	      a.keyUp(Keys.CONTROL);
	}

}
