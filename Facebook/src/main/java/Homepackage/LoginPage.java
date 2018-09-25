package Homepackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends CommonAPI {

     @FindBy(xpath = "//*[@id=\"email\"]")
     public static WebElement inputEmailBox ;
     @FindBy(xpath = "//*[@id=\"pass\"]")
     public static WebElement inputPasswordBox ;
     @FindBy(xpath = "//*[@id=\"u_0_8\"]")
     public static WebElement pressLoginButton;
     public void inputOnEmailBox(){
          inputEmailBox.click();
          inputEmailBox.sendKeys("\"ssinf_1989@live.fr\"");
     }
     public void inputOnPasswordBox (){
          inputPasswordBox.click();
          inputPasswordBox.sendKeys( "saddockoussa0306$$\"");

     }
     public void goToLoginButton(){
          pressLoginButton.click();
     }


}
