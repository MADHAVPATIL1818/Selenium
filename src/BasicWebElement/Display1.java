package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	      boolean emailtf=driver.findElement(By.id("pass")).isDisplayed();
	      System.out.println(emailtf);
	      
	}

}
