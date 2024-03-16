package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
	      driver.switchTo().frame(frame);
	      
	      WebElement destination = driver.findElement(By.id("droppable"));
	     WebElement source = driver.findElement(By.id("draggable"));
	      
	      Actions a=new Actions(driver);
	      a.dragAndDrop(source, destination);
	      a.perform();
	      
	      
	      
	}

}
