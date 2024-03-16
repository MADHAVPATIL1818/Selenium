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


public class MyntraAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//To click on search text field
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Facewashes");
		//click on search icon
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(2000);
    	TakesScreenshot ts=(TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d=new File("./Myn/img.png");
		FileUtils.copyFile(s, d);
		
		
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
		//to perfom scrolling
		JavascriptExecutor js=(	JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='DAVIDOFF Men Cool Water Eau De Toilette 75 ml']")).click();
		Thread.sleep(2000);
		
		Set<String> tabs = driver.getWindowHandles();
		for(String st:tabs) {
			String childurl = driver.switchTo().window(st).getCurrentUrl();
			if(childurl.contains(st)) {
				
			}
		}
		Thread.sleep(2000);
		//select quantity
		driver.findElement(By.xpath("//p[text()='100-150 ML']")).click();
		//mouse hover on add to bag
		 driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		 File ds=ts.getScreenshotAs(OutputType.FILE);
		 File o=new File("./Myn/img2.png");
		 FileUtils.copyFile(ds,o);
	
		
		

	
	}

}
