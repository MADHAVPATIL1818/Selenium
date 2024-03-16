rpackage Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloons {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.pantaloons.com/");
	      //To enter shoe in search tf
	      driver.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("shoes");
	      driver.findElement(By.cssSelector("div[class='search-bar-content-textSearch-icon']")).click();
	      //clicking on shoe image
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("img[alt='Olive Knit Sport Shoes']")).click();
	      
          Thread.sleep(2000);	
          
          WebElement ele = driver.findElement(By.xpath("span[text()='ADD TO BAG']"));
          Thread.sleep(2000);
          
          File tempfile=ele.getScreenshotAs(OutputType.FILE);
          
          File destinationfile=new File("./pantaloons/bag.png");
          
          FileUtils.copyFile(tempfile, destinationfile);
	      
   	   
	      
	}

}
