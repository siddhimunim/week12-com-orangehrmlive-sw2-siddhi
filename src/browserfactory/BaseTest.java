package browserfactory;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    // declare global varieble//
    public static WebDriver driver;
    //method for open browser
    public void  openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        //launch url
        driver.get(baseUrl);
        //maximise window//
        driver.manage().window().maximize();
        //impicit time to driver//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    //method for close browser//
    public void closeBrowser(){
        driver.quit();
    }


}
