package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

  @FindBy(css="#email_create")
    WebElement emailId;
    @FindBy(css="#SubmitCreate")
    WebElement createAnAccount;
    @FindBy(css="div.alert.alert-danger ol li")
    public static WebElement feedbackMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public  void enterValidEmail(String strArg1) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emailId.sendKeys(strArg1);
    }

    public void selectCreateAnAccount() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        createAnAccount.click();
    }
}
