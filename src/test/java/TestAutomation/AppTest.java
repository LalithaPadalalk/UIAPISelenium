package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestAutomation.utilities.Base;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
	public void test1()
    {
        System.out.println("Test print");
        log.info("Executed test message");
    }

   
}
