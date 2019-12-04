import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {
	
		WebDriver driver=new SafariDriver();
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
	// Right now selenium stopped working for safari browser below 10.0 
	}

}
