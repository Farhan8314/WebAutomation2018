package SignUpPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommonAPI {

    @FindBy(name ="firstname" )
    public static WebElement firstNameBox ;
    @FindBy(name = "lastname")
    public static WebElement lastNameBox;
    @FindBy(name = "reg_email__")
    public static WebElement emailBox;
    @FindBy(name = "reg_email_confirmation__")
    public static WebElement emailButtonConfirmation ;
    @FindBy(name = "reg_passwd__")
    public static WebElement passwordBox;
    @FindBy(name = "birthday_day")
    public static WebElement birthdayDayBox;
    @FindBy(name ="birthday_month")
    public static WebElement birthdayMonthBox;
    @FindBy(name = "birthday_year")
    public static WebElement birthdayYearBox;
    @FindBy(className = "_58mt")
    public static WebElement femaleBox;
    @FindBy(name = "websubmit")
    public static WebElement signUpButton;


    public void inputFirstName(){
        firstNameBox.click();
        firstNameBox.sendKeys("ssadia");
    }
    public void inputLastName(){
        lastNameBox.click();
        lastNameBox.sendKeys("ssehil");
    }
    public void inputEmail(){
        emailBox.click();
        emailBox.sendKeys("sadiasehil89@gmail.com");
    }
    public void inputEmailConfirmation(){
        emailButtonConfirmation.click();
        emailButtonConfirmation.sendKeys("sadiasehil89@gmail.com");
    }
    public void inputPassword(){
        passwordBox.click();
        passwordBox.sendKeys("123456$$");
    }
    public void inputBirthdayDay(){
        birthdayDayBox.click();
        birthdayDayBox.sendKeys("24");
    }
    public void inputBirthdayMonth(){
        birthdayMonthBox.click();
        birthdayMonthBox.sendKeys("Dec");
    }
    public void inputBirthdayYear(){
        birthdayYearBox.click();
        birthdayYearBox.sendKeys("1964");
    }
    public void pressFemaleButton(){
        femaleBox.click();
    }
    public void pressSignUButton(){
       signUpButton.click();
    }

    public void signInUsingExcelData (String FirstName,String LastName,String Email,String EmailC,String password, String birthDm, String birthDd,String birthDy) {
        firstNameBox.sendKeys(FirstName);
        lastNameBox.sendKeys(LastName);
        emailBox.sendKeys(Email);
        //emailButtonConfirmation.sendKeys(EmailC);
        passwordBox.sendKeys(password);
        birthdayDayBox.sendKeys(birthDd);
        birthdayMonthBox.sendKeys(birthDm);
        birthdayYearBox.sendKeys(birthDy);
    }


    }


