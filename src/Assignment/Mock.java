package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
          
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      //To launch the application
	      driver.get("https://www.myntra.com/");
	      //To enter shoes on search textfield
	      driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("shoes");
	      //To click on search icon
	      driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	      
	      //To click on brand
	      driver.findElement(By.xpath("//label[text()='Puma']")).click();
	      Thread.sleep(2000);
	      //To click any one of the shoe
	      driver.findElement(By.cssSelector("img[title='Puma Unisex Black Sneakers']")).click();
	      
	      //To transfer the control from parent window to child widnow
	      
	      Set<String> ids = driver.getWindowHandles();
	      
	     for(String s:ids) {
	    	 String url = driver.switchTo().window(s).getCurrentUrl();
	    	 if(url.contains(s)) {
	    		 break;
	    	 }
	     } 
	     
	     
	      
	      //to downcast to access the getscreenshotAS()
	      TakesScreenshot ts= (TakesScreenshot)driver;
	     File tempfile = ts.getScreenshotAs(OutputType.FILE);
	     File destfile =new File ("./myntra3/puma.png");
	     FileUtils.copyFile(tempfile, destfile);
	     
	      
	      
	      
	}

}
