package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      
	      String a=driver.findElement(By.name("login")).getCssValue("position");
	      System.out.println(a);
	}

}
