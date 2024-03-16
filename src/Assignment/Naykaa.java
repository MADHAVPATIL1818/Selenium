package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naykaa {
    public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
         d.get("https://www.tirabeauty.com/");
         
         WebElement search=d.findElement(By.id("search"));
         search.sendKeys("park avenue");
	     search.sendKeys(Keys.ENTER);
	     Thread.sleep(2000);
	     d.findElement(By.cssSelector("img[alt='Park Avenue | Park Avenue Euphoria Eau De Parfum (100ml)']")).click();
	     Thread.sleep(2000);
	     //To check how many windows 
	     Set<String> s=d.getWindowHandles();
	     System.out.println(s);
	     
	     //To transfer control from parent to child window
	     for(String a:s) {
	    	 String title=d.switchTo().window(a).getTitle();
	    	 System.out.println(title);
	      String	 childtitle="Buy Park Avenue Euphoria Eau De Parfum (100ml) Online at Best Price in India";
	    	 if(title.contains(childtitle)) {
	    		 break;
	    	 }
	     }
	     
         Thread.sleep(2000);
	     d.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	     //To transfer control from child window to parent window
	     for(String b:s) {
	    	 String titles=d.switchTo().window(b).getTitle();
	    	 System.out.println(titles);
	    	 String parenttitle="Tira: Shop Makeup, Skin, Hair & Beauty Products Online | www.tirabeauty.com";
	    	 if(titles.contains(parenttitle)) {
	    		 break;
	    	 }
	     }
	     d.findElement(By.xpath("//span[text()='Benefits']")).click();
	     d.findElement(By.xpath("//div[text()=' Long Lasting ']")).click();
         
         
	}

	
}
