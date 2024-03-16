package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      String a=driver.findElement(By.className("_8eso")).getText();
	      System.out.println(a);
	}

}
