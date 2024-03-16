package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       //To search search text field in the webpage
       Thread.sleep(6000);
       
       WebElement searchtf=driver.findElement(By.id("twotabsearchtextbox"));
       searchtf.sendKeys("watches");
       
       Thread.sleep(2000);
       searchtf.clear();
       
       
	}

}
