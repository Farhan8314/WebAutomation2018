package LoginPackage;

import Homepackage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriverService;


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
}

