package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tira1 {

	private static final String OutputType = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
		//To identify targeted element
		WebElement bath = driver.findElement(By.xpath("//a[text()='Bath & Body']"));
		
		//crate object of action class & pass webdriver refernece as an argument
		Actions a=new Actions(driver);
		//to mouse over on fragrance
		a.moveToElement(bath);
		//call perform()
		a.perform();
		//to click on hand wash
		driver.findElement(By.xpath("//a[text()=' Hand Wash ']")).click();
		
		//To Downcast javascriptexecutor---To Access excutescript()
		JavascriptExecutor js=(	JavascriptExecutor )driver;
		// call ExecuteScript (String script,object)
		//vertical scrolling form top to bottom
		Thread.sleep(2000);
		for(;;) {
			try {
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("img[alt='Marks & Spencer | Marks & Spencer Bergamot & Sandalwood Hand Wash (265ml)']")).click();
				break;
			}catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,2000)");
			}

		}
		//To identify how many windows are present
		Set<String> window = driver.getWindowHandles();
		
		for(String s:window) {
			String title = driver.switchTo().window(s).getTitle();
			
			if(title.contains(s)) {
				
			}
		}
		
		//To click on add to bag
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		//To click on cart
	//	driver.findElement(By.cssSelector("img[alt='cart icon']")).click();
		
		//To get screenshot of add to cart page
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call screenshotAs()
		File tempfile = ts.getScreenshotAs(OutputType.File);
		File destinationfile=new File("./tira/cart.png");
		//move from tempfile to destinationfile
		FileUtils.copyFile(tempfile, destinationfile);
		
		//To click on cart
				driver.findElement(By.cssSelector("img[alt='cart icon']")).click();
		
		
		
		
		

	}

}
