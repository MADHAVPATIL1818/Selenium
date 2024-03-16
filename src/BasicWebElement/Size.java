package BasicWebElement;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
  public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
     // Dimension size=driver.findElement(By.id("email")).click();
      //System.out.println(size.getWidth());
      //System.out.println(size.getHeight());
       loc= driver.findElement(By.id("email")).click();
      
      
}
}
