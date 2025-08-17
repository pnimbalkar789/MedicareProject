package Medicare_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Medicare_Pages.LoginPage;
import Medicare_Test.BaseClass;
import Medicare_Pages.ProductsPage;

public class ProductTest extends BaseClass{
	
	@Test
	public void SingleProdAddtoCartTest() throws InterruptedException {
	
		  LoginPage lp = new LoginPage();
		  lp.LoginFunction("npravin1306@gmail.com", "medicare@1234");
		  
		  ProductsPage pp =new ProductsPage();
		  pp.AddToCart("Paracetamol");
		  pp.CheckoutOrderSuccess();
		  
		}
	
	
	   @Test
	   public void MultipleProdAddtoCartTest() throws InterruptedException
	   {
		 LoginPage lp = new LoginPage();
		 lp.LoginFunction("npravin1306@gmail.com", "medicare@1234");
			  
		 ProductsPage pp =new ProductsPage();
		 pp.AddToCart("Paracetamol");
		 pp.MedicareTab();
		 pp.AddToCart("Combiflame");
		 pp.MedicareTab();
		 pp.AddToCart("Diclofenac");
		 pp.CheckoutOrderSuccess();  
		   
	   }
	
	
	
	
	
	
	
	
	
	}
	
	
	

