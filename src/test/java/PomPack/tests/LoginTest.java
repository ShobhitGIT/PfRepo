package PomPack.tests;

import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import PomPack.tests.base.BaseTest;
import PomPack.util.Constants;
import PomPack.util.ExtentManager;

public class LoginTest extends BaseTest {
	

	@Test
	public void testLogin() {
		
		//calling the getInstance() method from ExtentManager class
		
		 ExtentManager.getInstance();
		 eReport.startTest("LoginTest");
		eTest.log(LogStatus.INFO,"Login Test has started");
		
		OpenBrowser(Constants.BROWSER_TYPE);
		
		
	
		
		
	}

}
