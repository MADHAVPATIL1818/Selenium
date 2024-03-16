package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switch1 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          ChromeDriver d=new ChromeDriver();
          d.manage().window().maximize();
          d.get("https://www.myntra.com/");
          d.findElement(By.className("desktop-searchBar")).sendKeys("sunglasses");
  		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
  		Thread.sleep(2000);
  		
  		d.findElement(By.cssSelector("img[alt='RESIST EYEWEAR Unisex Black Lens Wayfarer Sunglasses UV Protected Lens MARK BLACK BLACK']")).click();
  		//To check how many window or tab is present
  		Set<String> ids=d.getWindowHandles();
  		System.out.println(ids);
  		
  		for(String a:ids) {
  			String title=d.switchTo().window(a).getTitle();
  			System.out.println(title);
  			if(title.contains(a)) {
  				
  			}
  		}
  		Thread.sleep(2000);
  		//to click on add to bag button
  		d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
  		Thread.sleep(2000);
  		d.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
  		
  		
	}

}
