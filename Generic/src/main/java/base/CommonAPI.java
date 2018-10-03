package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
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
    // Browser Stack Setup
    public WebDriver webDriver = null;
    public String browserstack_username= "sadiasehil1";
    public String browserstack_accesskey = "jax8LxSRbyxnfp7A5Hif";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";

    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
                      @Optional("OS X") String os, @Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("34")
                              String browserVersion, @Optional("http://www.amazon.com") String url)throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\IdeaProjects\\WebAutomation\\Generic\\drivers\\chromedriver.exe");
        if(useCloudEnv==true){
            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,os,os_version, browserName, browserVersion);
            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,os,os_version, browserName, browserVersion);
            }
        }else{
            getLocalDriver(os, browserName);
        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }
    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\IdeaProjects\\WebAutomation\\Generic\\drivers\\chromedriver.exe");
            }
            webDriver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("chrome-options")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\IdeaProjects\\WebAutomation\\Generic\\drivers\\chromedriver.exe");
            }
            webDriver = new ChromeDriver(options);
        }

        else if(browserName.equalsIgnoreCase("firefox")){
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver");
            }else if(OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\sadia\\IdeaProjects\\WebAutomation\\Generic\\drivers\\chromedriver.exe");
            }
            webDriver = new FirefoxDriver();

        } else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/browser-driver/IEDriverServer.exe");
            webDriver = new InternetExplorerDriver();
        }
        return webDriver;

    }


    public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String os, String os_version,String browserName,
                                    String browserVersion)throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("Saucelabs")){
            //resolution for Saucelabs
            webDriver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            webDriver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return webDriver;
    }

    @AfterMethod
    public void cleanUp(){
    driver.close();
}
}
