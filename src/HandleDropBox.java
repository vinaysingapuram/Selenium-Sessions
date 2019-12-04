import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

			//1. FF Browser
			//gecko driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\VINAY\\Softwares\\Selenium Web Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//Launches Fire Fox browser
		driver.get("http://www.google.com");
		driver.get("https://www.amazon.com/books-used-books-textbooks/b?ie=UTF8&node=283155"); //entering url
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Tom");
			
		//driver.findElement(By.linkText("Sign in")).click();
			
		//driver.findElement(By.cssSelector("#login-username")).sendKeys("Tom");
		
		//Handling a Drop Box
		
		Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByVisibleText("Books");	

	}

}
