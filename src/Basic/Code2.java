package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code2 {
  public static void main(String[] args) {
	  ChromeDriver d=new ChromeDriver();
	  //to launch the application
	  d.get("https://letcode.in/test");
	  //to search single element 
	  d.findElement(By.linkText("Sign up")).click();
	  //to search single element name textfield perform action enter name 
	  d.findElement(By.id("name")).sendKeys("Madhav Patil");
	  //to search single element email text field perform action enter email
	  d.findElement(By.id("email")).sendKeys("patilmadhav1818@egmail.com");
	  //to search single element password text filed perform action enter password
	  d.findElement(By.name("password")).sendKeys("Madhav@0406");
	  //to search single element checkbox text field perform action click checkbox
	  d.findElement(By.id("agree")).click();
	  //to search single element sign up text field perform action sign up
	  
	  
}
}
