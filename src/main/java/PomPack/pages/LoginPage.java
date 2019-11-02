package PomPack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="lid")
	public WebElement emailField;
	
	@FindBy(id="pwd")
	public WebElement passwordField;
	
	@FindBy(id="signin_submit")
	public WebElement singInButton;
	
	//Reusable method for logging into the application
		public void doLogin() {
			
			//	//Write the code for Login into application
			//send keys 
	
		}
		
		//Other reusable methods

	}


