package BasicWebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tira {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
		WebElement searchtf=driver.findElement(By.id("search"));
		searchtf.sendKeys("perfumes");
		searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("(//div[@class='product-name'])[2]")).getText();
		System.out.println(a);
		
	}

}
