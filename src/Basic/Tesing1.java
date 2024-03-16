package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tesing1 {
    public static void main(String[] args) {
		//ChromeDriver d=new ChromeDriver();
		
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.myntra.com/");
	}
}
