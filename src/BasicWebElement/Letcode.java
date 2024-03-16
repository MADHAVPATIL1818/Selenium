package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://letcode.in/test");
	      driver.findElement(By.xpath("//a[text()='Edit']")).click();
	      boolean let=driver.findElement(By.id("noEdit")).isEnabled();
	      System.out.println(let);
	      
	}

}
