package Medicare_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Medicare_Test.BaseClass;

public class LoginPage {
	

	WebDriver driver=BaseClass.driver;
	
	// ====================== Locators =========================
	
	    @FindBy(xpath = "//a[contains(text(), 'Login')]")
	    WebElement LoginLink;
	

		@FindBy(xpath = "//input[@id='username']")
		WebElement Email;

		@FindBy(xpath = "//input[@id='password']")
		WebElement Password;

		@FindBy(xpath = "//input[@value= 'Login']")
		WebElement LoginBtn;

		// ======================= Methods ======================
		
		// constructor to initialize all the web elements 
		public LoginPage() {
			
			PageFactory.initElements(driver, this);

		}


		public void LoginFunction(String UserNameVal, String PasswordVal) {

		  LoginLink.click();
		  Email.sendKeys(UserNameVal);
		  Password.sendKeys(PasswordVal);
		  LoginBtn.click();
		
	}

}
