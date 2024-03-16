package BasicWebDriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		//to search the sunglasses
		d.findElement(By.className("desktop-searchBar")).sendKeys("sunglasses");
				//to click on search icon
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		//to get parent window id
	//	String parentid=d.getWindowHandle();
		//System.out.println(parentid);
		
		d.findElement(By.cssSelector("img[alt='Voyage Unisex Square Sunglasses 58157MG2970']")).click();
		//to get all window id's
		
		Set<String> parentchild=d.getWindowHandles();
		System.out.println(parentchild);
		Thread.sleep(2000);
	//	d.close();
		//d.quit();
	}

}
