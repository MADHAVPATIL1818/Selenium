package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/");
	      
	     WebElement men = driver.findElement(By.xpath("//span[text()='MEN']"));
	     //object creation
	     Actions a=new Actions(driver);
	     
	     a.moveToElement(men);
	     a.perform();
	     driver.findElement(By.xpath("(//a[text()='Sunglasses & Frames'])[1]")).click();
	     driver.findElement(By.xpath("//div[text()='RS0038AV UV-Protected Square Sunglasses']")).click();
	     Thread.sleep(2000);
	     
	     //transfer control from parent window to child window
	     Set<String> ids = driver.getWindowHandles();
	     System.out.println(ids);
	     for(String s:ids) {
	    	String url= driver.switchTo().window(s).getTitle();
	    	String childtitle="https://www.ajio.com/royal-son-rs0038av-uv-protected-square-sunglasses/p/469186805_black";
	    	
	    	if(ids.contains(childtitle)) {
	    		break;
	    	}
	     }
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	     Thread.sleep(2000);
	     
	     //Downcast to get access
	     TakesScreenshot ts=(TakesScreenshot)driver;
	     
	     //call getscreenshotAs()
	     File tempfile = ts.getScreenshotAs(OutputType.FILE);
	     File destinationfile=new File("./sunglass/ajio.png");
	     Thread.sleep(2000);
	     
	     FileUtils.copyFile(tempfile,destinationfile);
	     
	     
	     
	      
	      
 	}

}
