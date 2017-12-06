package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

public class BasePage {

    public static WebDriver driver;
    //public static WebDriverWait wait=new WebDriverWait(driver,30);

public BasePage() {
    PageFactory.initElements(driver, this);
}

public String getTitle(){
    return driver.getTitle();

}
public String getPageUrl(){
    return driver.getCurrentUrl();

}


}
