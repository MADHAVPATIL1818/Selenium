package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	      Thread.sleep(2000);
	      
	      //click on men
	      driver.findElement(By.xpath("//label[text()='Men']")).click();
	      
	      //click on more
	    driver.findElement(By.xpath("//div[text()=' more']")).click();
	      
	      //select brand
	      driver.findElement(By.xpath("//label[text()='Fossil']")).click();
	      Thread.sleep(2000);
	      
	      
	     Thread.sleep(2000); 
	      //click image
	      WebElement img = driver.findElement(By.cssSelector("input[value='Fossil']"));
	      img.click();
	      
	}

}
