package SearchPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonAPI {
    @FindBy(className ="_1frb")
    public static WebElement inputSearchBox;
    @FindBy(className = "_585_")
    public static WebElement SearchButton;

  public void inputSearch(){
      inputSearchBox.click();
      inputSearchBox.sendKeys("farhan uddin");
  }
  public void pressSearchButton(){
      SearchButton.click();

  }
}
