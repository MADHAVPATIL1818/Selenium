package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://skillrary.com/");
	      driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	      driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
	      Thread.sleep(2000);
	      Set<String> ids = driver.getWindowHandles();
	      System.out.println(ids);
	 /*     for(String s:ids) {
	    	  String url=driver.switchTo().window(s).getCurrentUrl();
	    	  String childurl="https://demoapp.skillrary.com/";
	    	  if(url.contains(childurl)) {
	    		  break;
	    	  }
	      }
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("email")).sendKeys("admin");
	      Thread.sleep(2000);
	      driver.findElement(By.id("password")).sendKeys("admin");
	      Thread.sleep(2000);
	      driver.findElement(By.id("keepLoggedInCheckBox")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("last")).click();*/
	      
	      
	}

}
