package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SigClass extends CommonAPI {
    @Test
    public void sigUpMethod(){
        driver.get("https://www.facebook.com/");
        //driver.findElement(By.xpath("//*[@id=\"u_0_9\"]/div[7]/a")).click();

       driver.findElement(By.name("firstname")).sendKeys("ssadia");

       driver.findElement(By.name("lastname")).sendKeys("ssehil");
       //email
       driver.findElement(By.name("reg_email__")).sendKeys("sadiasehil89@gmail.com");
       //password
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sadiasehil89@gmail.com");
       driver.findElement(By.name("reg_passwd__")).sendKeys("123456$$");

      // findElement(By.xpath("id('u_0_b')")).sendKeys("cs083595");
     driver.findElement(By.name("birthday_day")).sendKeys("24");
     driver.findElement(By.name("birthday_month")).sendKeys("Dec");
     driver.findElement(By.name("birthday_year")).sendKeys("1964");

     driver.findElement(By.className("_58mt")).click(); //this code is working for female
    //fb.findElement(By.className("_5k")).click(); //this code is not working for male
        driver.findElement(By.name("websubmit")).click();
}}
