package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
        String s= driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getTagName();
        System.out.println(s);
	}

}
