package Assignment;



import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Skillrary1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		   
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://skillrary.com/");
		  //To get screenshot of homepage
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File temp = ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./skill.png");
		  FileUtils.copyFile(temp, dest);
		  
		    driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		    driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		    
		    
		    Set<String> window = driver.getWindowHandles();
		  System.out.println(window);
		  
		  for(String s:window) {
			 String i = driver.switchTo().window(s).getCurrentUrl();
			  if(i.contains(s)) {
				  break;
			  }
			  
		  }
		  driver.findElement(By.xpath("//a[text()='FEEDBACK']")).click();
		  
         File temp2=ts.getScreenshotAs(OutputType.FILE);
         File dest2=new File("./skill/invoice.png");
         FileUtils.copyFile(temp2, dest2);
         
         
	}

}
