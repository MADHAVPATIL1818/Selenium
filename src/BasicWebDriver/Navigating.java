package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver d=new ChromeDriver();
         d.manage().window().maximize();
       //  d.get("https://www.myntra.com/");
 		//d.findElement(By.className("desktop-searchBar")).sendKeys("sunglasses");
 		//d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
 		//Thread.sleep(2000);
 		
 		//To go back to main page
 		//d.navigate().back();
 		//Thread.sleep(2000);
 		//d.navigate().forward();
 		//Thread.sleep(2000);
 		//d.navigate().refresh();
         d.navigate().to("https://www.myntra.com/sunglasses?rawQuery=sunglasses");
	}

}
