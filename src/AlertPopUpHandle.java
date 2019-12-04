import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		//1. FF Browser
		//gecko driver
	
	System.setProperty("webdriver.gecko.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();//Launches Fire Fox browser
	
	driver.get("http://www.google.com");
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //entering url
	
	driver.findElement(By.name("proceed")).click(); //clicking on Go button
	
	Thread.sleep(5000);
	
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
		String text=alert.getText();
	if(text.equals("Please enter a valid "
			+ "user name")) {
		System.out.println("Correct text is displayed");
		}
	else {
		System.out.println("In Correct test is displayed");
	}
	
	alert.accept(); // click on ok button
	
	//alert.dismiss(); // Click on cancel 
		
		
	}

}
