package PomPack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaunchPage {
	
	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	
	@FindBy(className="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-contact")
	public WebElement ContactSales;
	
	@FindBy(className="zh-login")
	public WebElement Login;
	
	@FindBy(className="zh-signup")
	public WebElement SignUp;

	//Reusable method for navigating to Login page
	public void goToLoginPage() {
		
		//Write the code for navigating to Login Page
	// driver. get for launching url	
	}	
	
	
}
