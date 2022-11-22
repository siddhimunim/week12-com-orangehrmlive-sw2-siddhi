package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl= "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //enter valid username
        sendTextToElements(By.xpath("//input[@name='username']"),"Admin");
        //enter valid password
        sendTextToElements(By.xpath("//input[@name='password']"),"admin123");
        //click on login
        clickOnElement(By.xpath("//button[@type='submit']"));


    }
    @After
    public void tearDown(){
        closeBrowser();
    }




}
