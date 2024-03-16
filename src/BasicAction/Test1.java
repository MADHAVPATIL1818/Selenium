package BasicAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/");
	      //step1: identfy the element
	     WebElement men = driver.findElement(By.xpath("//span[text()='MEN']"));
	     
	     //step2:create object of action class
	     //step3:pass webdriver reference as an argument to action
	     
	     Actions a=new Actions(driver);
	     
	     //step4:mouse hover on men
	     a.moveToElement(men);
	     
	     //step5:call perform()
	     a.perform();
	}

}
