package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/");
	      
	      //step1: Downcast the takesscreenshot
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      
	      //step2:getscreenshotAs() & store screenshot in file form
	      File tempfile=ts.getScreenshotAs(OutputType.FILE);
	      
	      //step3: Create a folder in project & create  object for file class
	      File destinationfile=new File("./images/ajio.png");
	      
	      //step4:move the screenshot form temp location too destination location
	     // tempfile.renameTo(destinationfile);
	      
	      //step4: it create folder call copyfile()-it will copy the screenshot from 
	      FileUtils.copyFile(tempfile, destinationfile);
	      
	      //after execution refresh the project

	}

}
