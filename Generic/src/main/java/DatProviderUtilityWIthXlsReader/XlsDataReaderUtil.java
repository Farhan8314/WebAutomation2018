package datProviderUtilityWIthXlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

    ArrayList<Object[]> myData = new ArrayList<Object[]>();
    try {
        reader = new Xls_Reader("C:\\Users\\sadia\\IdeaProjects\\WebAutomation\\Generic\\src\\main\\java\\ExcelReaderPackage\\ExcelFile1.xls");
    }

    catch (Exception e){
        e.printStackTrace();
    }

     // change only sheet name in line 19
    for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
        String firstName  = reader.getCellData("Sheet1","FirstName", rowNum);
        String lastName = reader.getCellData("Sheet1", "LasteName", rowNum);
        String email = reader.getCellData("Sheet1","Email", rowNum);
        String emailC = reader.getCellData("Sheet1","EmailConfirmation", rowNum);
        String password = reader.getCellData("Sheet1","Password", rowNum);
        String birthDd = reader.getCellData("Sheet1","BirthdayMonth", rowNum);
        String birthDm= reader.getCellData("Sheet1","BirthdayDay", rowNum);
        String birthDy = reader.getCellData("Sheet1","BirthdayYear", rowNum);

        Object obj[] = {firstName,lastName,email,emailC, password,birthDm,birthDd,birthDy };
        myData.add(obj);
       }

    return  myData;
   }
}
