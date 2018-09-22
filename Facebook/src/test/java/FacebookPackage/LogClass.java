package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class LogClass extends CommonAPI {
    //Test1
    @Test
    public  void login() {
        //Login
        driver.get("https://www.facebook.com/?stype=lo&jlou=AffL1kumjGJFaiKBUKft7dtLlgTIWA7LzDxFjy2xUqIDQkrSAFTW4W4GN3as70Rdkzj1wblUZe5kLq_caBNS1RkP5uqJoN0BbKhbMnqs3-DjFg&smuh=1681&lh=Ac_3e75B5awbmx1v");
        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        username.sendKeys("ssinf_1989@live.fr");
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        Login.sendKeys("saddockoussa0306$$", Keys.ENTER);

        // serach on facebook
       // driver.findElement(By.className("_1frb")).sendKeys("farhan uddin",Keys.ENTER);
    }
       @Test
        public  void search() {
            login();
            driver.findElement(By.className("_1frb")).sendKeys("farhan uddin",Keys.ENTER);
        }
    //LogOut

        //driver.get("https://www.facebook.com/?stype=lo&jlou=AffL1kumjGJFaiKBUKft7dtLlgTIWA7LzDxFjy2xUqIDQkrSAFTW4W4GN3as70Rdkzj1wblUZe5kLq_caBNS1RkP5uqJoN0BbKhbMnqs3-DjFg&smuh=1681&lh=Ac_3e75B5awbmx1v");
       // driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"js_37\"]/div/div/ul/li[8]")).click();


    }

