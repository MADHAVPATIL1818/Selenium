package BasicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		//To click on drop-down
		driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
		WebElement dropdown = driver.findElement(By.id("superheros"));
		
		Select s=new Select(dropdown);
        s.selectByVisibleText("Captain America");
        s.selectByVisibleText("Batman");
        
        WebElement option = s.getFirstSelectedOption();
        System.out.println(option.getText());
	}

}
