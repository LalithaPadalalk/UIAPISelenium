package TestAutomation.pageRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	public WebDriver driver;
	
	By signIn_Email = By.xpath("//input[@id='session_email']");
	By signIn_Password = By.xpath("//input[@id='session_password']");
	By signIn_Button = By.xpath("//input[@type='submit']");
	By signUp_button = By.cssSelector("//a[href*='Sign up']");
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(signIn_Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(signIn_Password);
	}
	
	public HomePage getSignIn()
	{
		driver.findElement(signIn_Button).click();
		return new HomePage(driver);
	}
	
	
	
}
