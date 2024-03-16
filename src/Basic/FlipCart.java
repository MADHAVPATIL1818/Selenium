package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart {
   public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	//Launch The Application
	d.get("https://www.flipkart.com/");
	//d.findElement(By.cssSelector("img[alt='Mobiles']")).click();
	//d.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	//write a program to to search on mobile text
	d.findElement(By.xpath("//span[text()='Mobiles']")).click();
}
}
