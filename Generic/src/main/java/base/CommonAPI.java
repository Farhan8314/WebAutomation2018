package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

   public  WebDriver driver = null;
@BeforeMethod
    public void setUp (){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sadia\\IdeaProjects\\WebAutomation\\Generic\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");

}
/*@AfterMethod
    public void cleanUp(){
    driver.close();
}*/
}
