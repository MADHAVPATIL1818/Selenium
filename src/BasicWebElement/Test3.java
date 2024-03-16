package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://doodles.google/");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("button[class='glue-carousel__button glue-carousel__button--next interactive']")).click();
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("button[class='glue-carousel__button glue-carousel__button--prev interactive']")).click();
       
       }

}
