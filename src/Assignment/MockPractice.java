package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MockPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
         
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	    // WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	      //To mouse hover on men
	      
	      //Actions a=new Actions(driver);
	      //a.moveToElement(men);
	      //a.perform();
	      driver.findElement(By.className("desktop-searchBar")).sendKeys("Tshirts");
	      driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	      //To click on men
	      driver.findElement(By.xpath("//label[text()='Men']")).click();
	      //To click on wrogn 
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//label[text()='WROGN']")).click();
	      
	      //To scroll down
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("img[alt='WROGN Men Brown & Black Striped Round Neck T-shirt']")).click();
	      
	      Set<String> ids = driver.getWindowHandles();
	      for(String s:ids) {
	    	  String title = driver.switchTo().window(s).getTitle();
	    	  if(title.contains(s)) {
	    		  break;
	    	  }
	      }
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//p[text()='S']")).click();
	      driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	      
	      TakesScreenshot ts=(TakesScreenshot)driver;
	     File tempfile = ts.getScreenshotAs(OutputType.FILE);
	     File destfile=new File("./myntra2/cart.png");
	     FileUtils.copyFile(tempfile, destfile);
	     
	      
	      
	}

}
