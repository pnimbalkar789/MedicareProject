package Medicare_Test;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws MalformedURLException {
		
		
		
		driver=new ChromeDriver();
		driver.get("http://localhost:8081/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	   }
	
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
