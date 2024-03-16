package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloons {
    public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		//launch the pantaloons application
		d.get("https://www.pantaloons.com/");
		WebElement a=d.findElement(By.cssSelector("search-bar-content-textSearch-icon"));
		a.sendKeys("shoes");
		a.sendKeys("ENTER");
		d.findElement(By.cssSelector("img[title='White Knitted Upper Sport Shoes']\r\n"
				+ "")).click();
		
	}
}
