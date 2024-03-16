package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver d=new ChromeDriver();
       d.get("https://www.pantaloons.com/?utm_source=affiliate&utm_medium=cps_jan&utm_campaign=xploredigital_28&gclid=CjwKCAiAtt2tBhBDEiwALZuhAKuyH962d-aVEhTwYHsT9eNLFYo4C8yitf6k_iCgYJbAWcptBmvmyBoCORkQAvD_BwE");
       //to search element search text-field in the webpage and perform action enter perform
       d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("Perfume");
       //search in the web page icon in the web page and perform action click-on
      d.findElement(By.className("search-bar-content-textSearch-icon")).click();
      
	}

}
