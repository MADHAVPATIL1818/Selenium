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

public class Test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
	     
		
        //to search tf 
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Mobiles");
		//to click on search icon
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		//to select gender
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
		//to select any one image
		driver.findElement(By.cssSelector("img[alt='Karwan Solid Printed iPhone 13 Back Case Mobile Accessories']")).click();
	     
		//to get how many window are open
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String s:ids) {
			String url = driver.switchTo().window(s).getCurrentUrl();
			String childurl="https://www.myntra.com/mobile-accessories/karwan/karwan-solid-printed-iphone-13-back-case-mobile-accessories/27456208/buy";
			
			if(s.contains(childurl)) {
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		
	File tempfile=ts.getScreenshotAs(OutputType.FILE);
	
	    File destinationfile=new File("./mobile/phone");
	    FileUtils.copyFile(tempfile, destinationfile);
	    
	    
	
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		
		
		
		
	}

}
