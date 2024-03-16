package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
   public static void main(String[] args) {
	   //Lauch the empty chrome browser
	ChromeDriver d=new ChromeDriver();
	//lauch the ajio app
	d.get("https://www.ajio.com/");
	
	d.findElement(By.name("searchVal")).sendKeys("watches");
	d.findElement(By.className("ic-search")).click();
}
}
