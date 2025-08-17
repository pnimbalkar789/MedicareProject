package Medicare_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Medicare_Test.BaseClass;


public class ProductsPage {
	
	WebDriver driver = BaseClass.driver;
	
	public void AddToCart(String ProductName) throws InterruptedException {

		String ProductXapth = "(//h5[text() = '"+ProductName+"'])[1]//following::a[1]";

		WebElement ViewBtn = driver.findElement(By.xpath(ProductXapth));
		ViewBtn.click();
		
		Thread.sleep(3000);
		WebElement AddToCartBtn = driver.findElement(By.xpath("//a[@class = 'btn btn-success']"));
		AddToCartBtn.click();
		Thread.sleep(2000);
	}

	
	public void MedicareTab() throws InterruptedException
	{
		WebElement MedicareTab = driver.findElement(By.xpath("//a[contains(text(), 'Medicare')]"));
		MedicareTab.click();
		Thread.sleep(2000);
	}
	
	
	
    public void CheckoutOrderSuccess() throws InterruptedException {
		
		WebElement CheckoutBtn = driver.findElement(By.xpath("//a[@class= 'btn btn-success btn-block']"));
		
		if(CheckoutBtn.isDisplayed())
		{ 
		  CheckoutBtn.click();
	
		Thread.sleep(2000);
		WebElement AddressLine1 = driver.findElement(By.xpath("//input[@id= 'addressLineOne']"));
		AddressLine1.sendKeys("Main Street");
		WebElement AddressLine2 = driver.findElement(By.xpath("//input[@id= 'addressLineTwo']"));
		AddressLine2.sendKeys("Balaji nagar, satara");
		WebElement City = driver.findElement(By.xpath("//input[@id= 'city']"));
		City.sendKeys("Satara");
		WebElement PostalCode = driver.findElement(By.xpath("//input[@id= 'postalCode']"));
		PostalCode.sendKeys("415019");
		WebElement State = driver.findElement(By.xpath("//input[@id= 'state']"));
		State.sendKeys("Maharashtra");
		WebElement Country = driver.findElement(By.xpath("//input[@id= 'country']"));
		Country.sendKeys("India");
		WebElement AddAddressBtn = driver.findElement(By.xpath("//button[@type= 'submit']"));
		AddAddressBtn.click();
		
		Thread.sleep(2000);
		WebElement PaymentDetailsTab = driver.findElement(By.xpath("//h3[contains(text(), 'Payment Details')]"));
		if(PaymentDetailsTab.isDisplayed())
		{
			WebElement CardNumber = driver.findElement(By.xpath("//input[@id= 'cardNumber']"));
			CardNumber.sendKeys("432198765432");
			WebElement ExpiryMonth = driver.findElement(By.xpath("//input[@id= 'expityMonth']"));
			ExpiryMonth.sendKeys("02");
			WebElement ExpiryYear = driver.findElement(By.xpath("//input[@id= 'expityYear']"));
			ExpiryYear.sendKeys("2028");
			WebElement CvCode = driver.findElement(By.xpath("//input[@id= 'cvCode']"));
			CvCode.sendKeys("563");
			WebElement PayBtn = driver.findElement(By.xpath("//a[@class= 'btn btn-success btn-lg btn-block']"));
			PayBtn.click();
			
			Thread.sleep(2000);
			WebElement OrderConfirmation = driver.findElement(By.xpath("//h3[contains(text(), 'Your Order is Confirmed!!')]"));
			Boolean status= OrderConfirmation.isDisplayed();
			if(status = true)
			{
				System.out.println("Checkout is working and Order is successfully placed");
			}
			else {
				System.out.println("Checkout is not working and user unable to see order details");
			  }
		    }
		   else
		    {
			System.out.println("User is unable to see payment detail tab");
			
		    }
		
		    }
		   else
	 	    {
			System.out.println("Checkout button is not displayed");
		    }
          }
	
	
	
	
	
	
	
	
	
	
	
}
