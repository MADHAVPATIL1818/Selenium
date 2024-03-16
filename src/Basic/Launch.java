package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver d=new ChromeDriver();
       //launch the application
       d.get("https://letcode.in/");
       //to search single element
       d.findElement(By.linkText("Sign up")).click();
       //to search single element name textfield perform action enter name
       d.findElement(By.id("name")).sendKeys("Madhav Patil");
       //to search single element email text-field perform action enter email
       d.findElement(By.id("email")).sendKeys("patilmadhav1818@gmail.com");
       //to search single element password text-field perform action enter password
       d.findElement(By.id("pass")).sendKeys("Madhav@0406");
       //to search single element checkbox text-field perform action click checkbox
       d.findElement(By.id("agree")).click();
       
	}
}
       
	
	
