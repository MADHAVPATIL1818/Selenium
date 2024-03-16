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
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//To enter on search tf
		driver.findElement(By.className("desktop-searchBar")).sendKeys("perfume");
		//To click on search icon
		driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		//To click on men
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		//To scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//call executeScript()
	js.executeScript("window.scrollBy(0,1000)");
		//To click on any perfume
		Thread.sleep(2000);
	//	driver.findElement(By.cssSelector("img[title='BEARDO Men Whisky Smoke Eau De Parfum - 100 ml']")).click();
		
		 Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		for(String s:ids) {
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
			if(s.contains(title)) {
				break;
			}
			
		}
		
		//To add bag
	//	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		//To take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./practice/perfume.png");
		FileUtils.copyFile(temp, destfile);
		
		
		
		
		
		
		
		
	}

}
