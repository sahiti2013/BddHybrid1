package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {
    @FindBy(css = ".info-account")
    WebElement accountInfo;

    @FindBy(css = ".account")
    WebElement accountName;
    @FindBy (css="#cart_title")
    WebElement dressesSummary;


    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnMyAccountPage() {
        return accountInfo.isDisplayed();
    }

    public String getAccountName() {
        return accountName.getText();
    }

    public boolean summaryDisplay() {
        return dressesSummary.isDisplayed();
    }
}
