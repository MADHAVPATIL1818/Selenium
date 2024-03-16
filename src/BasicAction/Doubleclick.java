package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoapp.skillrary.com/");
	      Thread.sleep(2000);    
	      
	      WebElement course = driver.findElement(By.id("course"));
	      
	      Actions a=new Actions(driver);
	      a.moveToElement(course);
	      a.perform();
	      
	      Thread.sleep(2000);
	      //clicking on QA
	      driver.findElement(By.xpath("(//a[text()='QA'])[1]")).click();
	      //Double click on plus
	      Thread.sleep(2000);
	      WebElement plus = driver.findElement(By.cssSelector("i[class='fa fa-plus']"));
	      a.doubleClick(plus);
	      a.perform();
	      
	}

}
