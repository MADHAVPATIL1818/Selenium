package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {
  public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	d.get("https://letcode.in/test");
	//search element edit and perform action clicking on edit
	d.findElement(By.linkText("Edit")).click();
	//search element name and perform action enter full name
	d.findElement(By.id("fullName")).sendKeys("Madhav Patil");
	//search element sign in and perform action 
	d.findElement(By.className("button is-primary")).click();
	
	
	
}
}
