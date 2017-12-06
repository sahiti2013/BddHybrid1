package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

public class ContactUsPage extends BasePage{
@FindBy(css=".navigation_page")
    WebElement contactTitle;
@FindBy(css="#id_contact")
WebElement heading;
@FindBy(css = "#email")
WebElement email;
@FindBy(css="#id_order")
WebElement orderRefrence;
@FindBy(css="#fileUpload")
WebElement uploadFile;
@FindBy(css="#message")
WebElement message;
@FindBy(css="#submitMessage")
WebElement sendBtn;
@FindBy(xpath = "html/body/div[1]/div[2]/div/div[3]/div/p")
public static WebElement feedbackMessage;





    public boolean contactUsPageTitle() {
        return contactTitle.isDisplayed();
    }

    public void selectHeading(String arg1) {
        Select select = new Select(heading);
        select.selectByValue(arg1);
    }

    public void typeEmail(String arg1) {
        email.sendKeys(arg1);
    }

    public void typeOrderRefrence(String arg1) {
        orderRefrence.sendKeys(arg1);
    }

    public void attachFile(String arg1) {
       uploadFile.sendKeys(arg1);

        }



    public void typeMessage(String arg1) {
        message.sendKeys(arg1);
    }

    public void clickSendBtn() {
        sendBtn.click();
    }


}
