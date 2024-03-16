package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
	      driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	      //click on men
	      driver.findElement(By.xpath("//label[text()='Men']")).click();
	    //click on more
	     // driver.findElement(By.cssSelector("div[class='brand-more']")).click();
	      
	      //select brand
	      
	      Thread.sleep(3000);
	      
	      
	      
	      
	     
	}

}
