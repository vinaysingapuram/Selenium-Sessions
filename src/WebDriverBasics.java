

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
    
		//1. FF Browser
		//gecko driver
		//System.setProperty("webdriver.gecko.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();//Launches Fire Fox browser
		//driver.get("http://www.google.com");
		
	
		//2. Chrome Browser Launching
		
		System.setProperty("webdriver.chrome.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launches Chrome browser 
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//validation point
    	if(title.equals("Google")) {
		System.out.println("Title is Correct");}
		else {
		System.out.println("Title is In Correct");
		}
		
    	driver.quit(); //for closing the chorme browser
    	
		//WebDriver driver=new SafariDriver();
		//driver.get("http://www.google.com");
		
	
	//Chrome driver Initialization
	
	//System.setProperty("webdriver.chrome.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
	//	driver.get("http:\\google.com");
	//	String title=driver.getTitle();
	//	System.out.println(title);
	//	if(title.equals("Google"))
	//	{System.out.println("Correct Title");
	//			}
	//	else {
	//		System.out.println("In Correct Title");
	//	}
	//		
	//	driver.quit();
	}
}