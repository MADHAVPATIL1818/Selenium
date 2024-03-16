package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("shoes");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("//label[text()='Men (35,581)']")).click();
		driver.findElement(By.xpath("//div[text()='Smashic Unisex Sneakers']")).click();
		
		

	}

}
