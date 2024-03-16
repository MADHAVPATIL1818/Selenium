package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://jqueryui.com/draggable/");
	      
	      
	     WebElement b = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
	      //To transfer control to frame
	      driver.switchTo().frame(b);
	      
	      
	      
	      //To drag & drop
	      WebElement source = driver.findElement(By.id("draggable"));
	      
	      Actions a=new Actions(driver);
	      
	      //To move horizontally
	      //a.dragAndDropBy(source, 100, 0);
	      
	      //To move vertically
	      a.dragAndDropBy(source, 0, 100);
	      a.perform();
	      
	}

}
