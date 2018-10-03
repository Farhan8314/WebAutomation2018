package SignUpPackage;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import SignUpPackage.SignUpPage;

public class SigUpTestClass extends SignUpPage {
    SignUpPage obOfSignUp;
    @BeforeMethod
    public void initialization(){ obOfSignUp= PageFactory.initElements(driver,SignUpPage.class);
    }
    @Test
    public void TestInputFirstName (){
        obOfSignUp.inputFirstName();
    }
    @Test
    public void TestInputLastName() {
        obOfSignUp.inputLastName();


    }

    @Test
    public void TestInputEmail() {

        obOfSignUp.inputEmail();
    }
    @Test
    public void TestInputEmailConfirmation(){
        obOfSignUp.inputEmailConfirmation();
    }
    @Test
    public void TestInputPassword(){
        obOfSignUp.inputPassword();
    }
    @Test
    public void TestInputBirthdayDay(){
        obOfSignUp.inputBirthdayDay();
    }
    @Test
    public void TestInputBirthdayMonth(){
        obOfSignUp.inputBirthdayMonth();
    }
    @Test
    public void TestInputBirthdayYear(){
        obOfSignUp.inputBirthdayYear();
    }
    @Test
    public void TestPressFemaleButton(){
        obOfSignUp.pressFemaleButton();
    }
    @Test
    public void TestPressSignUButton(){
        obOfSignUp.pressSignUButton();
    }





}
