package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.amazon.in/");
	      
	        driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
	        Thread.sleep(2000);
	        WebElement series = driver.findElement(By.xpath("//h1[text()='Web Series']"));	
	        Thread.sleep(2000);
	        
	        File tempfile=series.getScreenshotAs(OutputType.FILE);
	        
	        File destinationfile=new File("./ajio/series.png");
	        FileUtils.copyFile(tempfile, destinationfile);
	        
	        
  }

}
