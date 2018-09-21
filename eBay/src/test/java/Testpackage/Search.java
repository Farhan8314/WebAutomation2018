package Testpackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Search  extends CommonAPI {
@Test
    public void searchitem(){
    driver.findElement(By.cssSelector("#gh-ac")).sendKeys("computer", Keys.ENTER);
}

}
