package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	     // Dimension size=driver.findElement(By.id("email")).getSize();
	      
	      //System.out.println(size.getWidth());
	      //System.out.println(size.getHeight());
	   //Point  location=driver.findElement(By.id("email")).getLocation();
	     // System.out.println(location.getX());
	      //System.out.println(location.getY());
	   Rectangle  rec= driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).getRect();
	      System.out.println(rec.width);
	      System.out.println(rec.height);
	      System.out.println(rec.x);
	      System.out.println(rec.y);
}
}
