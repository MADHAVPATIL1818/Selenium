package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.myntra.com/");
	
	WebElement a=d.findElement(By.className("desktop-searchBar"));
	a.sendKeys("watches");
	a.sendKeys(Keys.ENTER);
	d.findElement(By.cssSelector("img[title='Park Avenue Signature Collection Voyage Amazon Woods Intense Premium Perfume Spray 120 ml']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//label[text()='Men']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//label[text()='Smart Watches']")).click();
}
}
