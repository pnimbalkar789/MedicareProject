package Medicare_Test;

import org.testng.annotations.Test;

import Medicare_Pages.SignUpPage;

public class SignUpTest extends BaseClass{
	
	
	@Test
	public void SignUpSuccessValidation() throws InterruptedException
	{
		SignUpPage sp = new SignUpPage();
		sp.SignUpSuccess();
		
		
	}

}
