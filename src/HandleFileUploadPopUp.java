import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//Launches Fire Fox browser
		
		driver.get("http://www.google.com");
		
		driver.get("https://html.com/input-type-file/"); //entering url

		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\user\\Desktop\\test11.txt");
	
		
	}

}
