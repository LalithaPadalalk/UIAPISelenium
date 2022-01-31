package TestAutomation.pageRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By Login = By.xpath("//a[@id='sign-in']");
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public SignInPage getLogin()
	{
		driver.findElement(Login).click();
		return new SignInPage(driver);
		
	}
	

}
