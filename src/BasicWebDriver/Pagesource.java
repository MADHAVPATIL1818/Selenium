package BasicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {
   public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tirabeauty.com/");
	String s=driver.getPageSource();
	System.out.println(s);
}
}
