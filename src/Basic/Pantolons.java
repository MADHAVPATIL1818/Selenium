package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantolons {
    public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.pantaloons.com/");
		d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("wallets");
		d.findElement(By.cssSelector("div[class='search-bar-content-textSearch-icon']")).click();
		
	}
}
