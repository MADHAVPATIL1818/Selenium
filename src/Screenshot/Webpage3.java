package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		   //to take current time
		  LocalDateTime	ldt=LocalDateTime.now();
		  //to take current date time & replace : char with - 
		  String datetime=ldt.toString().replace(':', '-');
		
		
		
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      
	      
	      //taking the screenshot of myntra home page
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      File tempfile=ts.getScreenshotAs(OutputType.FILE);
	      File destinationfile=new File("./myntra/homepage"+datetime+".png");
	      Thread.sleep(3000);
	     FileUtils.copyFile(tempfile, destinationfile);
	     
	     Thread.sleep(4000);
	     //enter perfume in the searchtf
	     driver.findElement(By.className("desktop-searchBar")).sendKeys("perfumes");
	     //click on search icon
	     driver.findElement(By.className("desktop-submit")).click();
	     
	     Thread.sleep(4000);
	     //taking the screenshot of myntra perfume page
	     File tempfile1=ts.getScreenshotAs(OutputType.FILE);
	      File destinationfile1=new File("./myntra/perfumepage\"+datetime+\".png");
	     FileUtils.copyFile(tempfile1, destinationfile1);
	     
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//label[text()='Men']")).click();
	     Thread.sleep(4000);
	     //taking the screenshot of myntra gender
	     File tempfile2=ts.getScreenshotAs(OutputType.FILE);
	     File destinationfile2=new File("./myntra/men\"+datetime+\".png");
	     FileUtils.copyFile(tempfile2,destinationfile2);
	     
	     
	     
	     
	     
	}

}
