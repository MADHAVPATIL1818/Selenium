package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Pantaloon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver d = new ChromeDriver();
       d.get("https://www.pantaloons.com/");
       Thread.sleep(2000);
       d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("perfumes");
       Thread.sleep(2000);
       d.findElement(By.className("search-bar-content-textSearch-icon")).click();
       Thread.sleep(2000);
    WebElement a=   d.findElement(By.cssSelector("select[class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']"));
      a. sendKeys(" Price - Low to High");
      Thread.sleep(2000);
      a.sendKeys(Keys.ENTER);
	}

}
