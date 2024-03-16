package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElemenetScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      //step1: search myntra icon
	      WebElement icon = driver.findElement(By.cssSelector("a[class='myntraweb-sprite desktop-logo sprites-headerLogo ']"));
           
	      Object outputType;
		//step2:call getscreenshotAs & store in file form
	      File tempfile=icon.getScreenshotAs(OutputType.FILE);
	      
	      //step3:create object of file & in file pass constructor
	      File destinationfile=new File("./Element/myntra.png");
	      
	      //step4:
	      FileUtils.copyFile(tempfile, destinationfile);
	      
	      
	      
	      
	}

}
