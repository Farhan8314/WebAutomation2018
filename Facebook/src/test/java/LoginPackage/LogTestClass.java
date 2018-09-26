package LoginPackage;

import Homepackage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LogTestClass extends LoginPage {
    LoginPage obOfLogin;
    @BeforeMethod
   public void initialization(){ obOfLogin= PageFactory.initElements(driver,LoginPage.class);
    }
    @Test
    public void TestInputEmailBox (){
        obOfLogin.inputOnEmailBox();
    }
    @Test
    public void TestInputPassword() {

        obOfLogin.inputOnPasswordBox();
    }
    @Test
    public void TestGoToLoginButton(){
        obOfLogin.goToLoginButton();
    }



     /*  @Test
        public  void search() {
            login();
            driver.findElement(By.className("_1frb")).sendKeys("farhan uddin",Keys.ENTER);
        }

       // @Test
   /* public void sendMessage(){
        login();
           // driver.findElement(By.className("_2n_9 f_click")).click();
            //driver.findElement(By.className("clearfix")).click();
            //driver.findElement(By.className("_1mf _1mj")).sendKeys("hello",Keys.ENTER);
           // driver.findElement(By.name("mercurymessagesCountValue")).click();
            driver.get("https://www.facebook.com/messages");
            //driver.findElement(By.cssSelector("#row_header_id_user\\3a 100007378364569 > a > div._1qt4._5l-m")).click();
        }


    //LogOut

        //driver.get("https://www.facebook.com/?stype=lo&jlou=AffL1kumjGJFaiKBUKft7dtLlgTIWA7LzDxFjy2xUqIDQkrSAFTW4W4GN3as70Rdkzj1wblUZe5kLq_caBNS1RkP5uqJoN0BbKhbMnqs3-DjFg&smuh=1681&lh=Ac_3e75B5awbmx1v");
       // driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"js_37\"]/div/div/ul/li[8]")).click();*/


    }

