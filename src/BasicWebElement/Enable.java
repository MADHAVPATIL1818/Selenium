package BasicWebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Enable {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/?");
	      
	   boolean search=  driver.findElement(By.name("searchVal")).isEnabled();
	   System.out.println(search);
	   driver.findElement(By.name("searchVal")).sendKeys("Bag");
	   driver.findElement(By.className("ic-search")).click();
	   driver.findElement(By.cssSelector("img[alt='Product image of BFT Prime Striped Sling Bag']")).click();
	   
	   Set<String> ids=driver.getWindowHandles();
	   
	   for(String a:ids) {
		  String  url= driver.switchTo().window(a).getCurrentUrl();
		  
		  String childurl="https://www.ajio.com/bft-prime-striped-sling-bag/p/465812723_multi";
		  if(url.contains(childurl)) {
			  break;
		  }
	   }
	   Thread.sleep(2000);
	   //enable or not
	  boolean bag= driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).isEnabled();
	  System.out.println(bag);
	  //add to bag
	  driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	  //click on go to bag
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	  Thread.sleep(2000);
	 boolean  radio=driver.findElement(By.xpath("(//span[@class='ic-Radio-Buton-Of default-radio-button '])[1]")).isSelected();
      System.out.println(radio);	  
	   
	      
	      
	      
	   
}
}
