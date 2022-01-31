package TestAutomation.pageRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	By homePage_WelcomeMessage = By.xpath("//div[@class='text-center']/h1");
	By homePage_SignOutButton = By.xpath("//a[@data-test='sign-out']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWelcomeMessage()
	{
		return driver.findElement(homePage_WelcomeMessage);
	}
	
	public WebElement getSignOut()
	{
		return driver.findElement(homePage_SignOutButton);
	}

}
