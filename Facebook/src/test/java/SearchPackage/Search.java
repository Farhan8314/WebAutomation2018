package SearchPackage;


import LoginPackage.LogTestClass;
import SearchPackage.SearchPage;

import org.testng.annotations.Test;

public class Search extends SearchPage {
    SearchPage obOfSearch;
    LogTestClass logTestClass =new LogTestClass();


    @Test
    public  void search() {
        obOfSearch.inputSearch();


    }
}
