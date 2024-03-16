package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static  void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      
	      //downcast
	      TakesScreenshot ts=(TakesScreenshot) driver;
	      
	    File  tempfile = ts.getScreenshotAs(OutputType.FILE);
	    File destfile=new File("./homepage/myntra");
	    
	    FileUtils.copyFile(tempfile, destfile);
	    
	    
	    
	      
	     
	      
        
	}

}
