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

       driver.findElement(By.name("inputtext _58mg _5dba _2ph-")).sendKeys("ssadia");

       driver.findElement(By.cssSelector("#u_0_n")).sendKeys("ssehil");
       //email
       driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys("sadiasehil89@gmail.com");
       //password
       driver.findElement(By.xpath("//*[@id=\"u_0_z\"]")).sendKeys("12345");

      // findElement(By.xpath("id('u_0_b')")).sendKeys("cs083595");
     driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("24");
     driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Dec");
     driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1964");

     driver.findElement(By.className("_58mt")).click(); //this code is working for female
    //fb.findElement(By.className("_5k")).click(); //this code is not working for male
        driver.findElement(By.name("Create an account")).submit();
}}
