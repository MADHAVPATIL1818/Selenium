package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloons {
    public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("sunglasses");
		Thread.sleep(2000);
		 d.findElement(By.className("search-bar-content-textSearch-icon")).click();
		 Thread.sleep(2000);
		 d.findElement(By.cssSelector("img[src='https://imagescdn.pantaloons.com/img/app/product/8/878902-10543587.jpg?q=75&auto=format&w=250&h=400?q=75&auto=format&w=250&h=400']")).click();
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		 Thread.sleep(2000);
		 d.navigate().back();
		 //to click on select brand
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//p[text()='Brand']")).click();
		 
		 
		 //To click on brand
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//div[text()='Fila (15)']")).click();
		 //To select an image
		 Thread.sleep(2000);
		 d.findElement(By.cssSelector("img[src='https://imagescdn.pantaloons.com/img/app/product/8/878400-10519440.jpg?q=75&auto=format&w=250&h=400?q=75&auto=format&w=250&h=400']")).click();
		 //To add to bag
		 d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		 //to click on cart
		 d.findElement(By.cssSelector("a[title='Cart']")).click();	 
		 
		
		
	}
}
