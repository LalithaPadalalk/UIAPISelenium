package TestAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestAutomation.pageRegistration.HomePage;
import TestAutomation.pageRegistration.LandingPage;
import TestAutomation.pageRegistration.SignInPage;
import TestAutomation.utilities.Base;
import junit.framework.Assert;

public class SanityTest extends Base{	
	public WebDriver driver;
	
	@BeforeClass
	public void InitializeWebDriver() throws IOException {
		this.driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		log.info("Web Browser initiated");
	}
	@AfterClass
	public void shutDownDriver()
	{
		driver.close();
		log.info("Web Browser Closed");
		System.out.println("AfterTest");
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		data[0][0] = "lalithapadala3@gmail.com";
		data[0][1]="test@123";
		data[0][2]="Welcome to Address Book";
				
//		data[1][0] = "lalithapadala3@gmail.com";
//		data[1][1]="test@123";
//		data[1][2]="Welcome to Address Book";
//		
		return data;		
	}
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String EmailID, String Password, String WelcomeMessage) throws IOException
	{
		System.out.println("I am Test");
		LandingPage l = new LandingPage(driver);
		SignInPage sp = l.getLogin();
		log.info("Navigated to SignIn Page");
		sp.getEmail().sendKeys(EmailID);
		sp.getPassword().sendKeys(Password);
		HomePage hp = sp.getSignIn();
		log.info("Logged into the home page");
		
		//Task 1 = add soft assertion here
		Assert.assertEquals(WelcomeMessage,hp.getWelcomeMessage().getText());
//		Assert.assertEquals(true, hp.getWelcomeMessage().isDisplayed());
//		Assert.assertTrue(hp.getWelcomeMessage().isDisplayed());	
	}

}
