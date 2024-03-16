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

public class MyntraAssign1 {

	public static  void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
          
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(men);
		a.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
		//click on price
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Rs. 9112 to Rs. 18075']")).click();
		//To scroll down
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		//to click on any shirt
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Polo Ralph Lauren Cotton Round Neck Short Sleeves Slim-Fit Casual T-shirt']")).click();
		
		//To transfer control form parent window to child window
		Set<String> ids = driver.getWindowHandles();
		
		for(String s:ids) {
			String title = driver.switchTo().window(s).getTitle();
			
			if(title.contains(s)) {
				break;
			}
		}
		//To click on size chart
		driver.findElement(By.xpath("//p[text()='L']")).click();
		//To click on add to bag
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		//To click on go to bag
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		//To take screenshot of shopping bag
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Tshirt.png");
		FileUtils.copyFile(tempfile, destfile);
		
		
		
	
		
	}

}
