package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BasePage {
    @FindBy(xpath="//*[text()='Create an account']")
    WebElement createAnAcntTitle;
    @FindBy(id="id_gender2")
    WebElement selectGender;
    @FindBy(css="#customer_firstname")
    WebElement enterFirstName;
    @FindBy(css="#customer_lastname")
    WebElement enterLastName;
    @FindBy(css="#email")
    WebElement userEmail ;
    @FindBy(css="#passwd")
    WebElement userPassword ;
    @FindBy(css="#days")
    WebElement day ;
    @FindBy(css="#months")
    WebElement month ;
    @FindBy(css="#years")
    WebElement year ;
    @FindBy(css="#firstname")
    WebElement firstNameAgain ;
    @FindBy(css="#lastname")
    WebElement lastNameAgain;
    @FindBy(css="#address1")
    WebElement address;
    @FindBy(css="#city")
    WebElement city;
    @FindBy(css="#id_state")
    WebElement state;
    @FindBy(css="#postcode")
    WebElement postCode;
    @FindBy(css="#id_country")
    WebElement country;
    @FindBy(css="#other")
    WebElement additionalInfo;
    @FindBy(css="#phone")
    WebElement homePhone;
    @FindBy(css="#phone_mobile")
    WebElement mobileNum;
    @FindBy(css="#alias")
    WebElement alias;
    @FindBy(css="#submitAccount")
    WebElement submitButton;
    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement loginInfo;



    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }




    public void createAnAccountTitle() {
       // ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        //return createAnAcntTitle.isDisplayed();

    }

    public void clickGender() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectGender.click(); }

    public void firstName(String strArg1) {
        enterFirstName.sendKeys(strArg1); }

    public void lastName(String strArg1) {
        enterLastName.sendKeys(strArg1); }

    public void enterEmailAddress(String strArg1) {
        userEmail.clear();
        userEmail.sendKeys(strArg1);
    }

    public void enterPassword(String strArg1) {
        userPassword.clear();
        userPassword.sendKeys(strArg1);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void selectDOB(String strArg1, String strArg2, String strArg3) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select=new Select(day);
            select.selectByValue(strArg1);
            Select select1=new Select(month);
            select1.selectByValue(strArg2);
            Select select3=new Select(year);
            select3.selectByValue(strArg3);

        //Utils.selectFromListByValue(day,strArg1);
        //Utils.selectFromListByValue(month,strArg1);
        //Utils.selectFromListByValue(year,strArg1);
    }


    public void firstNameInYourAddress(String strArg1) {
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
           // driver.findElement(By.id("firstname")).clear();
           // driver.findElement(By.id("firstname")).sendKeys(strArg1);
        firstNameAgain.clear();
        firstNameAgain.sendKeys(strArg1);

    }

    public void LastNameInAddress(String strArg1) {
        //driver.findElement(By.id("lastname")).sendKeys(strArg1);
        lastNameAgain.clear();
        lastNameAgain.sendKeys(strArg1);
    }

    public void Address(String strArg1) {
        address.clear();
        address.sendKeys(strArg1);
    }

    public void enterCity(String strArg1) {
        //driver.findElement(By.id("city")).sendKeys(strArg1);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)
        city.clear();
        city.sendKeys(strArg1);

    }

    public void selectCity(String strArg1) {
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select4=new Select(state);
       select4.selectByValue(strArg1);
       // Utils.selectFromListByValue(state,strArg1);

    }
    public void EnterPostCode(String strArg1) {
        postCode.sendKeys(strArg1);
    }


    public void selectCountry(String strArg1) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select2=new Select(country);
        select2.selectByVisibleText(strArg1);
        //Utils.selectFromList(country,strArg1);
    }

    public void EnterAdditionalInfo(String strArg1) {
        // driver.findElement(By.id("other")).sendKeys(strArg1);
        additionalInfo.sendKeys(strArg1);

    }

    public void enterHomePhone(String strArg1) {
        //driver.findElement(By.id("phone")).sendKeys(strArg1);
        homePhone.sendKeys(strArg1);
    }

    public void enterMobileNum(String strArg1) {
        //driver.findElement(By.id("phone_mobile")).sendKeys(strArg1);
        mobileNum.sendKeys(strArg1);
    }

    public void enterAlias(String strArg1) {
        alias.clear();
        alias.sendKeys(strArg1);
    }

    public void clickRegister() {
        //driver.findElement(By.id("submitAccount")).click();
        submitButton.click();
        //driver.findElement(By.cssSelector("div.alert.alert-danger ol li"))
    }
}
