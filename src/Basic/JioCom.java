package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioCom {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	//maximize the window
	d.manage().window().maximize();
	d.get("https://www.jio.com/");
	//wait
	Thread.sleep(2000);
	
	
	//search the element mobile 
	d.findElement(By.linkText("Mobile")).click();
	Thread.sleep(2000);
    d.findElement(By.linkText("True 5G")).click();
    Thread.sleep(2000);
    d.findElement(By.linkText("JioFiber")).click();
    Thread.sleep(2000);
    d.findElement(By.linkText("AirFiber")).click();
    Thread.sleep(2000);
    d.findElement(By.linkText"))
	
}
}
