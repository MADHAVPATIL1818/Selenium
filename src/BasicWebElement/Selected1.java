package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/?");
	      driver.findElement(By.name("searchVal")).sendKeys("watches");
	      driver.findElement(By.className("ic-search")).click();
	      driver.findElement(By.xpath("//label[text()='Men (8,209)']")).click();
	      Thread.sleep(2000);
	      boolean text=driver.findElement(By.xpath("//label[text()='Men (8,209)']")).isSelected();
	      System.out.println(text);
	}

}
