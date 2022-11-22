package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test
    //test for forgot password
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on forgot password
        clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
        //verify nevigate to reset password
        String expectedMessage="Reset Password";
        String actualMessage = getTextCompareElement(By.xpath("//button[@type='submit']"));
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
