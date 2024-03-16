package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myntra1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	      driver.findElement(By.cssSelector("img[alt='Timex Pairs Silver-Toned Analogue Watch - TW00PR213']")).click();
	      
	      Set<String> ids=driver.getWindowHandles();
		   for(String s:ids) {
			  String url= driver.switchTo().window(s).getCurrentUrl();
			  String childurl="https://www.myntra.com/watch-gift-set/timex/timex-pairs-silver-toned-analogue-watch---tw00pr213/2470493/buy";
			  if(url.contains(childurl)) {
				  break;
			  }
		   }
	    
	      Thread.sleep(2000);
	      
	      
	      driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	      Thread.sleep(2000);
	      Set<String> id=driver.getWindowHandles();
		   for(String s:ids) {
			  String url= driver.switchTo().window(s).getCurrentUrl();
			  String parenturl="https://www.myntra.com/watches";
			  if(url.contains(parenturl)) {
				  break;
			  }
		   }
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//label[text()='Men']")).click();
		   
	}

}
