package SearchPackage;


import Homepackage.LoginPage;
import LoginPackage.LogTestClass;
import SearchPackage.SearchPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search extends SearchPage {
    SearchPage obOfSearch;
    LoginPage obOfLogin;
    @BeforeMethod
    public void initialization(){  obOfLogin= PageFactory.initElements(driver,LoginPage.class);
        obOfSearch= PageFactory.initElements(driver, SearchPage.class);
    }


//    @Test
//    public  void search() {
//
//        obOfLogin.inputOnEmailBox();
//        obOfLogin.inputOnPasswordBox();
//        obOfLogin.goToLoginButton();
//        obOfSearch.inputSearch();
//
//
//    }
}
