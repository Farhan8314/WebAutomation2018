package TestCase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Electronics extends CommonAPI {

    @Test
    public void clickonElectronics() {
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w0-w0\"]/button/span")).click();

    }
     @Test
    public void clickonCellPhones() {
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"w1-w0-w1\"]/button/span")).click();
        }


    }





