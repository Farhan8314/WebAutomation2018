package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Search extends CommonAPI {
   @Test
    public  void search() {

        LogClass logclass = new LogClass();
        logclass.login();
       driver.findElement(By.className("_1frb")).sendKeys("farhan uddin",Keys.ENTER);
    }
}
