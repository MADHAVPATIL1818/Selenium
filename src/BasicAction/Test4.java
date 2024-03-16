package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      WebElement home = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
          
	      Actions a=new Actions(driver);
	      a.moveToElement(home);
	      //a.build();---selenium 3 version we using to build actions class elements & perform actions
	      
	      a.perform();
	}

}
