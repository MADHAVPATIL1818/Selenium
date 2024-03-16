package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      
	      //step1: Downcast takescreenshot-to access getscreenshotAs()
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      
	      //step2: call getscreenshotAs() & store screenshot in file form
	      File tempfile=ts.getScreenshotAs(OutputType.FILE);
	      
	      //step3: call getabsolutepath() to know the location of screenshot
	  //    System.out.println(tempfile.getAbsolutePath());
	      
	      //steps to store screenshot inside the current project
	      //Create object of file & in file constructor pass the path
	      File destinationfile=new File("./Screenshot/myntra.png");
	      
	      //move the screenshot form temp location ti destination location
	      tempfile.renameTo(destinationfile);
	      
	      //after execution refresh the project
	      
	}

}
