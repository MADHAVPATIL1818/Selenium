package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
       driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).submit();
       // driver.findElement(By.xpath("//a[text()='Forgotten password?']")).submit();
        
	}

}
