package PomPack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(css="span[class^='zicon-apps-calendar']")
	public WebElement Calendar;
	
	
	@FindBy(css="span[class^='zicon-apps-books']")
	public WebElement Books;

	@FindBy(css="span[class^='zicon-apps-chat']")
	public WebElement Cliq;
	
	@FindBy(css="span[class^='zicon-apps-connect']")
	public WebElement Connect;
	
	@FindBy(css="span[class^='zicon-apps-crm']")
	public WebElement Crm;
	
	@FindBy(css="span[class^='zicon-apps-mail']")
	public WebElement Mail;
	
	
	@FindBy(css="span[class^='zicon-apps-support']")
	public WebElement Desk;
	
	//Reusable method to verify the presence of CRM option
	
		//Reusable method for navigating to CRM option
		
		//Reusable method for navigating to SalesIQ option
		
		//Reusable method for navigating to Cliq option
	

}
