package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver d=new ChromeDriver();
      // d.get("https://www.facebook.com/");
       
       //d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
       d.get("https://www.myntra.com/");
       d.findElement(By.xpath("//label[text()='Men']")).click();
	}

}
