package BasicWebDriver;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tira1 {
     public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
	     WebElement searchtf = driver.findElement(By.id("search"));
	     searchtf.sendKeys("perfumes");
	     searchtf.sendKeys(Keys.ENTER);
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("img[alt='Estee Lauder | Estee Lauder Modern Muse Eau De Parfum Spray (50ml)']")).click();
	     //To Check how many windows are present
	     Set<String> ids=driver.getWindowHandles();
	     System.out.println(ids);
	     //To transfer control parent to child window
	     for(String a:ids) {
	    	String title=driver.switchTo().window(a).getTitle();
	    	System.out.println(title);
	    	
	    	String childtitle="Estee Lauder Modern Muse Eau De Parfum Spray (50ml)";
	    	if(title.contains(childtitle)) {
	    		break;
	    	}
	     }
	     
	     //to add to bag
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	     
	     
	     //To transfer control from child to parent window
	     
	     for(String b:ids) {
	    	 String title1=driver.switchTo().window(b).getTitle();
	    	 System.out.println(title1);
	    	 
	    	 String parenttitle="Tira: Shop Makeup, Skin, Hair & Beauty Products Online | www.tirabeauty.com";
	    	 if(title1.contains(parenttitle)) {
	    		 break;
	    	 }
	     }
	     //to perform action on parent window
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='Brand']")).click();
	     driver.findElement(By.xpath("//div[text()=' Engage ']")).click();
	     
	
		
	
}
}
