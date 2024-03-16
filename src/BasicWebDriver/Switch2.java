package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch2 {
    public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.ajio.com/");
		d.findElement(By.name("searchVal")).sendKeys("watches");
		d.findElement(By.className("ic-search")).click();
		d.findElement(By.cssSelector("img[alt='Product image of JUST CAVALLI JC1L228M0085 Wrap-Around Analogue Watch']")).click();
		
		Set<String> ids=d.getWindowHandles();
  		System.out.println(ids);
  		
  		for(String a:ids) {
  			//To transfer control from one window to another window
  			String url=d.switchTo().window(a).getCurrentUrl();
  			System.out.println(url);
  			
  			String childurl="https://www.ajio.com/just-cavalli-jc1l228m0085-wrap-around-analogue-watch/p/465270253_silver";
  			if(url.contains(childurl)) {
  				break;
  			}
  		}
  		//click on add to bag
  		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	}
}
