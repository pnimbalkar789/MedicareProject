package Medicare_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Medicare_Pages.LoginPage;


@Listeners(listener.class)


public class LoginTest extends BaseClass {

	
	@Test(priority= 0)
	public void LoginSuccessTestWithCorrectCred() {
	   LoginPage lp = new LoginPage();
	   lp.LoginFunction("npravin1306@gmail.com", "medicare@1234");
		
		WebElement user = driver.findElement(By.xpath("//a[@class= 'btn btn-default dropdown-toggle']"));
		String message= user.getText();
		System.out.println(message);
		Assert.assertEquals(user.getText(), "Pravin Nimbalkar");

	}
	
	
	@Test(priority=1)
	public void LoginFailiureTestWithIncorrectCred() {
		
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("npr@gmail.com", "pravin@567");
		
		WebElement ErrorMsg = driver.findElement(By.xpath("//div[contains(text(), 'Username and Password is invalid!')]"));
		String message= ErrorMsg.getText();
		System.out.println(message);
		Assert.assertEquals(ErrorMsg.getText(), "Username and Password is invalid!");

	}
	
	
	
	
	
}
