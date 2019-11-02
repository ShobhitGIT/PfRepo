package PomPack.tests.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PomPack.util.Constants;
import PomPack.util.ExtentManager;

public class BaseTest {

	public WebDriver driver = null;
	public ExtentReports eReport = ExtentManager.getInstance();
	public ExtentTest eTest = null;
	
	public void OpenBrowser(String BROWSER_TYPE) {
	System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_EXE);
	driver = new ChromeDriver();
	
	eTest.log(LogStatus.INFO,"Successfully opened browser ");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
}
	
	
	
}