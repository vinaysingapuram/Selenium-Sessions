 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
public class LocatorConcept {

	public static void main(String[] args) {
     
			
		//System.setProperty("webdriver.chrome.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://login.yahoo.com/account/create?specId=yidReg"); //enter url
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Tom");
		
		//1. FF Browser
			//gecko driver
		
			System.setProperty("webdriver.gecko.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();//Launches Fire Fox browser
			driver.get("http://www.google.com");
			driver.get("https://login.yahoo.com/account/create?specId=yidReg"); //entering url
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Tom");
			
			driver.findElement(By.linkText("Sign in")).click();
			
			driver.findElement(By.cssSelector("#login-username")).sendKeys("Tom");
	}
}
