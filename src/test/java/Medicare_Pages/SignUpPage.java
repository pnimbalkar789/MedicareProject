package Medicare_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Medicare_Test.BaseClass;

public class SignUpPage {
	
	WebDriver driver = BaseClass.driver;
	
	public void SignUpSuccess() throws InterruptedException
	{
		WebElement SignUpLink = driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]"));
		if(SignUpLink.isDisplayed())
		{
			SignUpLink.click();
			Thread.sleep(2000);
			WebElement FirstName = driver.findElement(By.xpath("//input[@id= 'firstName']"));
			FirstName.sendKeys("Brian");
			WebElement LastName = driver.findElement(By.xpath("//input[@id= 'lastName']"));
			LastName.sendKeys("Lara");
			WebElement Email = driver.findElement(By.xpath("//input[@id= 'email']"));
			Email.sendKeys("brianl@gmail.com");
			WebElement ContactNo = driver.findElement(By.xpath("//input[@id= 'contactNumber']"));
			ContactNo.sendKeys("8995768549");
			WebElement Password = driver.findElement(By.xpath("//input[@id= 'password']"));
			Password.sendKeys("brianl@5678");
			WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id= 'confirmPassword']"));
			ConfirmPassword.sendKeys("brianl@5678");
			WebElement SelectRole = driver.findElement(By.xpath("//input[@id= 'role1']"));
			SelectRole.click();
			WebElement NextBillingBtn = driver.findElement(By.xpath("//button[@name='_eventId_billing']"));
			NextBillingBtn.click();
			
			Thread.sleep(2000);
			WebElement AddressLine1 = driver.findElement(By.xpath("//input[@id= 'addressLineOne']"));
			AddressLine1.sendKeys("181 Mercer Street");
			WebElement AddressLine2 = driver.findElement(By.xpath("//input[@id= 'addressLineTwo']"));
			AddressLine2.sendKeys("NY 10012");
			WebElement City = driver.findElement(By.xpath("//input[@id= 'city']"));
			City.sendKeys("New York");
			WebElement PostalCode = driver.findElement(By.xpath("//input[@id= 'postalCode']"));
			PostalCode.sendKeys("412308");
			WebElement State = driver.findElement(By.xpath("//input[@id= 'state']"));
			State.sendKeys("New York State");
			WebElement Country = driver.findElement(By.xpath("//input[@id= 'country']"));
			Country.sendKeys("United States");
			WebElement NextConfirmBtn = driver.findElement(By.xpath("//button[contains(text(), 'Next - Confirm')]"));
			NextConfirmBtn.click();
			
			Thread.sleep(2000);
			WebElement ConfirmBtn = driver.findElement(By.xpath("//a[contains(text(), 'Confirm')]"));
			ConfirmBtn.click();
			
			Thread.sleep(2000);
			WebElement LoginHereBtn = driver.findElement(By.xpath("//a[contains(text(), 'Login Here')]"));
			LoginHereBtn.click();
			
			Thread.sleep(2000);
			WebElement LoginEmail = driver.findElement(By.xpath("//input[@id= 'username']"));
			LoginEmail.sendKeys("brianl@gmail.com");
			WebElement LoginPassword = driver.findElement(By.xpath("//input[@id= 'password']"));
			LoginPassword.sendKeys("brianl@5678");
			
			WebElement LoginBtn = driver.findElement(By.xpath("//input[@value= 'Login']"));
			LoginBtn.click();
			
			WebElement User = driver.findElement(By.xpath("//a[@class= 'btn btn-default dropdown-toggle']"));
			Boolean UserDD = User.isDisplayed();
			if(UserDD = true)
			{
				System.out.println("User is able to sign up successfully");
			}
			else
			{
				System.out.println("User is not able to sign up successfully");
			}
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
