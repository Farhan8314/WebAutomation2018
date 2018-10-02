package SignUpUsignDataProviderPackage;/*
package SignUpUsignDataProviderPackage;

import SignUpPackage.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class SignUpTestUsingDtaProvider  extends SignUpPage {
    SignUpPage obOfSignUp;
    @BeforeMethod
    public void initialization(){ obOfSignUp= PageFactory.initElements(driver, SignUpPage.class);

    }
   @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData= XlsxDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    @Test(dataProvider = "supplyData")
    public void signUnTest (String firstName, String lastName, String email,String emailC,String password, String birthDd, String birthDm,String birthDy ) throws InterruptedException {
//       TestLogger.log("firstname: " + firstName);
//        TestLogger.log("lastname: " + lastName);
//        TestLogger.log("email: " + email);
//        TestLogger.log("email: " + emailC);
//        TestLogger.log("password: " + password);
//        TestLogger.log("birthDayDay: " + birthDd);
//        TestLogger.log("birthDayMonth: " + birthDm);
//        TestLogger.log("birthDayYear" + birthDy);birthDy

       // objOfHomePage.clikSignIn();
        //objOfSignInPage.switchToSignInForm();
       // TestLogger.log("In Sign In Page");
        obOfSignUp.signInUsingExcelData(firstName, lastName, email,emailC,password, birthDd,birthDm,birthDy );
        obOfSignUp.pressFemaleButton();
       // TestLogger.log("Press Female Button " );
        obOfSignUp.pressSignUButton();
       // TestLogger.log("Test Passed");

    }


}
*/
