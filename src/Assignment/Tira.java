package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();	
	   //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://www.tirabeauty.com/");
			//identify the targeted element
			WebElement fragrance = driver.findElement(By.xpath("//a[text()='Fragrance']"));
			 //step2:create object of action class
		     //step3:pass webdriver reference as an argument to action
			Actions a=new Actions(driver);
			//step4:mouse hover on fragarance
			a.moveToElement(fragrance);
			//call perfome()
			a.perform();
			//click on perfume edt & edp
			driver.findElement(By.xpath("(//a[text()=' Perfume (EDT & EDP) '])[2]")).click();
			
			//downcast javascriptExecutor
			JavascriptExecutor js=(	JavascriptExecutor)driver;
			
			
			for(;;) {
			try {
				driver.findElement(By.cssSelector("img[alt='Beardo | Beardo Godfather Eau De Parfum (50ml)']")).click();
				break;
			}catch(NoSuchElementException e){
				js.executeScript("window.scrollBy(0,1000)");
				
				
			}
			}
			
			//To check how many window are open
			Set<String> ids = driver.getWindowHandles();
			//System.out.println(ids);
			
			for(String s:ids) {
				String childurl = driver.switchTo().window(s).getCurrentUrl();
				//System.out.println(childurl);
				
				if(childurl.contains(s)) {
					
				}
			}
			
			
			driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
			
			
			
					
	}

}
