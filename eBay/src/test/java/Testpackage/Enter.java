package Testpackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Enter extends CommonAPI {
@Test
 public void clickonSearh() {
    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
}
    @Test
    public void clickonHome(){
       driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[1]/span"));

    }

@Test
    public void SearchTshirt(){
    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Tshirt", Keys.ENTER);
}
@Test
    public void SearchMafiBhai(){
    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("MafiBhai", Keys.ENTER);
}


}







