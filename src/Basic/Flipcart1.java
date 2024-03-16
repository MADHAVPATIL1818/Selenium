package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart1 {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	
	WebElement a=d.findElement(By.name("q"));
	a.sendKeys("Hp laptop");
	a.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	d.findElement(By.xpath("//div[contains(text(),'AXL Intel Celeron Dual Core 9th Gen - (4 GB/256 GB SSD/Windows 11 Home) 15W_LAP0')]")).click();
}
}
