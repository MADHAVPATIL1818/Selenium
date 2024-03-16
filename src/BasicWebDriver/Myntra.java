package BasicWebDriver;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
    public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		//to get  url of webpage
		//String currenturl=d.getCurrentUrl();
		//System.out.println(currenturl);
		d.findElement(By.className("desktop-searchBar")).sendKeys("sunglasses");
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	   // Set<String> ids = d.getWindowHandles();
	    //System.out.println(ids);
	    //for(String a:ids) {
	    	//String title=d.switchTo().window(a).getTitle();
	    	//System.out.println(title);
	    	
	   // 	if(title.contains(""))
	    			
	   // }
		
	}
}
