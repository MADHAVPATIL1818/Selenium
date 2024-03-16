package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      //To get height and width of searchtf
	     Dimension searchtf=driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).getSize();
	     System.out.println(searchtf.getHeight());
	     System.out.println(searchtf.getWidth());
	     //eneter watches in searchtf
	     driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("watches");
	     //click on search icon
	     driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	     //To take height and width of watch image
	    Dimension s=  driver.findElement(By.cssSelector("img[title='Timex Pairs Silver-Toned Analogue Watch - TW00PR213']")).getSize();
	    System.out.println(s.getWidth());
	    System.out.println(s.getHeight());
}
}
