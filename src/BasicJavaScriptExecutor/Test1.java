package BasicJavaScriptExecutor;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.ajio.com/");
		Thread.sleep(4000);
		
		//step1: Downcast javascriptexecutor---To Access excutescript()
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Step2: call ExecuteScript (String script,object)
		//vertical scrolling form top to bottom
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		//vertical scroolling form bottom to top
		//js.executeScript("window.scrollBy(0,-1000)");
		
		
		//horizontal scrooling form left to right
		
	//	js.executeScript("window.scrollBy(600,0)");
		//Thread.sleep(2000);
		//horizontal scrolling from right to left
		//js.executeScript("window.scrollBy(-300,0)");
		//scroll top to bottom
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//scroll bottom to top
		//js.executeScript("window.scrollTo(0,-document.body.scroolHeight)");
		
		//horizontally left to right
		//js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		
		//horizpntally right to left
		//js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		
	//	js.executeScript("window.scrollTo(0,900)");
		//js.executeScript("window.scrollTo(0,-400)");
		

		
		
	}

}
