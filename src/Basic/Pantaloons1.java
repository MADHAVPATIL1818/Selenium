package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloons1 {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.pantaloons.com/");
	d.findElement(By.xpath("//input[placeholder='Search for products and more...']")).sendKeys("perfumes");
	Thread.sleep(2000);
	d.findElement(By.className("div[class='search-bar-content-textSearch-icon']")).click();
	Thread.sleep(2000);
	d.findElement(By.cssSelector("select[class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']")).sendKeys(" Price - Low to High");
	
	}


}

