package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Let {
   public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	d.get("https://letcode.in/test");
	d.findElement(By.linkText("Sign up")).click();
	d.findElement(By.id("name")).sendKeys("Madhav Patil");
	d.findElement(By.id("email")).sendKeys("patilmadhav1818@gmail.com");
	d.findElement(By.id("pass")).sendKeys("Madhav1818");
	d.findElement(By.id("agree")).click();
	d.findElement(By.xpath("//button[text()='SIGN UP']")).click();
}
}
