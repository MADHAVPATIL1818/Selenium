package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver d=new ChromeDriver();
        d.get("https://www.ajio.com/");
        //to get title of the current web page
        String actualtitle=d.getTitle();
        System.out.println(actualtitle);
        //to enter perfume in text field
        d.findElement(By.name("searchVal")).sendKeys("perfumes");
        //to click on search icon
        d.findElement(By.className("ic-search")).click();	
        //to get the current page title
        String perfumepage=d.getTitle();
        System.out.println(perfumepage);
   }

}
