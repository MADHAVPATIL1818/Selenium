package BasicWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
    public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.nykaa.com/");
		//to maximize the window
	//	d.manage().window().maximize();
		
		//to minimze the window
		//d.manage().window().minimize();
		
		//to get fullscreen of the window
		//d.manage().window().fullscreen();
		
		//to get default width & height of the window
		//Dimension a=d.manage().window().getSize();
		//System.out.println(a);
		//System.out.println(a.getWidth());
		//System.out.println(a.getHeight());
		
		//To set the width & height of the window
		//Dimension dm=new Dimension(600,840);
		//d.manage().window().setSize(dm);
		
		//To get the default X & Y position
		//Point c=d.manage().window().getPosition();
		//System.out.println(c);
		//System.out.println(c.getX());
		//System.out.println(c.getY());
		
		//To set the position X & Y axis
		Point p=new Point(500,300);
		d.manage().window().setPosition(p);
		
		
	}
}
