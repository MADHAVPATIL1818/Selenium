package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrubute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      //identify email tf
	      WebElement emailtf=driver.findElement(By.id("email"));
	      //enter email in emailtf
	     emailtf. sendKeys("patilmadhav1818@gmail.com");
	     Thread.sleep(2000);
	     //select the data present in email tf
	     emailtf.sendKeys(Keys.CONTROL+"a");
	     //copy the data present email tf
	     Thread.sleep(2000);

	     emailtf.sendKeys(Keys.CONTROL+"c");
	     //paste the data present in email tf to pass tf
	     Thread.sleep(2000);
	     driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	     
	     
	      
	}

}
