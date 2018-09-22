package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class Search extends CommonAPI {
    //Test1
    @Test
    public  void login()  {
        //Login
        driver.get("https://www.facebook.com/?stype=lo&jlou=AffL1kumjGJFaiKBUKft7dtLlgTIWA7LzDxFjy2xUqIDQkrSAFTW4W4GN3as70Rdkzj1wblUZe5kLq_caBNS1RkP5uqJoN0BbKhbMnqs3-DjFg&smuh=1681&lh=Ac_3e75B5awbmx1v");
        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        username.sendKeys("ssinf_1989@live.fr");
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        Login.sendKeys("saddockoussa0306$$", Keys.ENTER);


    }//LogOut
    /*
        driver.get("https://www.facebook.com/?stype=lo&jlou=AffL1kumjGJFaiKBUKft7dtLlgTIWA7LzDxFjy2xUqIDQkrSAFTW4W4GN3as70Rdkzj1wblUZe5kLq_caBNS1RkP5uqJoN0BbKhbMnqs3-DjFg&smuh=1681&lh=Ac_3e75B5awbmx1v");
        WebElement navigationclick = driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]"));
        // WebElement Logout = driver.findElement(By.xpath("//*[@id=\"js_2g\"]/div/div/ul/li[8]"));
        //Logout.click();
    }*/
}
