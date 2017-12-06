package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css = ".login")
    WebElement signIn;
    @FindBy(css="#search_query_top")
    WebElement searchBoxText;
    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement searchBtn;
    @FindBy(xpath="//a[@title='Contact Us']")
    WebElement contactUsLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void selectSignInLink() {
        signIn.click();
    }

    public void enterTextInSearch(String strArg1) {
        searchBoxText.sendKeys(strArg1);
    }

    public void clickSearch() {
        searchBtn.click();
    }


    public void selectContactUS() {
        contactUsLink.click();
    }
}
