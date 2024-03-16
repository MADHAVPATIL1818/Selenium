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

public class Ajio {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/");
	      driver.findElement(By.name("searchVal")).sendKeys("watches");
	      driver.findElement(By.className("ic-search")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("label[class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	      driver.findElement(By.cssSelector("img[alt='Product image of Skylona skm 9180 Analogue Watch with Deployant Clasp ']")).click();
	      
	      Set<String> ids=driver.getWindowHandles();
		   
		   for(String a:ids) {
			  String  url= driver.switchTo().window(a).getTitle();
			  
			  String childtitle="https://www.ajio.com/skylona-skm-9180-analogue-watch-with-deployant-clasp-/p/466296274_black";
			  if(url.contains(childtitle)) {
				  break;
			  }
		   }
		   TakesScreenshot ts = (TakesScreenshot) driver;
			  File temp = ts.getScreenshotAs(OutputType.FILE);
			  File destination = new File("./AjioWatch/View1.png");
			  FileUtils.copyFile(temp, destination);
			  
		   File temp2=ts.getScreenshotAs(OutputType.FILE);
		   File destination2=new File("./AjioWatch/View2.png");
		   FileUtils.copyFile(temp2, destination2);
		   
		   
			  
		   File temp3=ts.getScreenshotAs(OutputType.FILE);
		   File destination3=new File("./AjioWatch/View2.png");
		   FileUtils.copyFile(temp3, destination3);
		   
		   
			  
			  
					  
			  

		  
		      
			     
		      
	      
	}

}
