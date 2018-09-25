package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
@BeforeMethod
    public void setUp (){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sadia\\IdeaProjects\\WebAutomation2018\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("www.facebook.com");

}
/*@AfterMethod
    public void cleanUp(){
    driver.close();
}*/
}
