
package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utils.BrowserFactory;

import java.util.concurrent.TimeUnit;

public class RegistrationSteps  {
        //static WebDriver driver;
@Before
public void startUp(){
    BrowserFactory.startBrowser();
}
@After
public void closeUp(){
    BrowserFactory.stopBrowser();
}
public BasePage basePage;
public LoginPage loginPage;
public RegistrationPage registrationPage;
public HomePage homePage;

    @Given("^user on Home page$")
      public void user_on_home_page()  {
          homePage = new HomePage();
           Assert.assertTrue(homePage.getTitle().equals("My Store"));

        }

        @When("^user click the SignIn button in home page$")
        public void user_click_the_signin_button_in_home_page()  {

            homePage.selectSignInLink();

        }
        @And("^enters a valid email as \"([^\"]*)\"$")
        public void enters_a_valid_email_as_something(String strArg1)  {
           loginPage=new LoginPage();
         loginPage.enterValidEmail(strArg1);

        }
        @And("^clicks Create An Account button$")
        public void clicks_create_an_account_button()  {
            loginPage.selectCreateAnAccount();

        }

        @Then("^user will be on Register page$")
        public void user_will_be_on_register_page()  {
            //driver.findElement(By.xpath("//*[text()='Create an account']")).isDisplayed();
            registrationPage=new RegistrationPage();
            registrationPage.createAnAccountTitle();
        }

        @When("^user have clicked on MRS tiltle$")
        public void user_have_clicked_on_mrs_tiltle()  {
        registrationPage.clickGender();

        }
       @And("^user have entered a First Name as \"([^\"]*)\"$")
        public void user_have_entered_a_first_name_as_something(String strArg1)  {
        registrationPage.firstName(strArg1);

        }

        @And("^user have entered a Last Name as \"([^\"]*)\"$")
        public void user_have_entered_a_last_name_as_something(String strArg1)  {
           // driver.findElement(By.id("customer_lastname")).sendKeys(strArg1);
            registrationPage.lastName(strArg1);
        }

        @And("^user have entered a Email \"([^\"]*)\"$")
        public void user_have_entered_a_email_something(String strArg1)  {
            registrationPage.enterEmailAddress(strArg1);
        }

        @And("^user have entered a Password as \"([^\"]*)\"$")
        public void user_have_entered_a_password_as_something(String strArg1)  {
           // driver.findElement(By.id("passwd")).sendKeys(strArg1);
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            registrationPage.enterPassword(strArg1);
        }

        @And("^user have selected Date Of Birth \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
        public void user_have_selected_date_of_birth_something_something_something(String strArg1, String strArg2, String strArg3)  {


           registrationPage.selectDOB(strArg1,strArg2,strArg3);

        }

        @And("^in YOUR ADDRESS section user have entered First Name as \"([^\"]*)\"$")
        public void in_your_address_section_user_have_entered_first_name_as_something(String strArg1)  {

            registrationPage.firstNameInYourAddress(strArg1);
        }

        @And("^user have entered a Last name in address as \"([^\"]*)\"$")
        public void user_have_entered_a_last_name_in_address_as_something(String strArg1) {
            //driver.findElement(By.id("lastname")).clear();
            //driver.findElement(By.id("lastname")).sendKeys(strArg1);
            registrationPage.LastNameInAddress(strArg1);

        }

        @And("^user have entered a Address as \"([^\"]*)\"$")
        public void user_have_entered_a_address_as_something(String strArg1)  {
            //driver.findElement(By.id("address1")).sendKeys(strArg1);
            registrationPage.Address(strArg1);

        }

        @And("^user have entered a City \"([^\"]*)\"$")
        public void user_have_entered_a_city_something(String strArg1)  {
            //driver.findElement(By.id("city")).sendKeys(strArg1);
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            registrationPage.enterCity(strArg1);
        }

        @And("^user have selected a state \"([^\"]*)\"$")
        public void user_have_selected_a_state_something(String strArg1)  {
           // Select select4=new Select(driver.findElement(By.id("id_state")));
            //select4.selectByValue(strArg1);
            registrationPage.selectCity(strArg1);
        }

        @And("^user have entered a Zip/PostalCode \"([^\"]*)\"$")
        public void user_have_entered_a_zippostalcode_something(String strArg1)  {
           // driver.findElement(By.id("postcode")).sendKeys(strArg1);
            registrationPage.EnterPostCode(strArg1);

        }

        @And("^user have selected a Country \"([^\"]*)\"$")
        public void user_have_selected_a_country_something(String strArg1)  {
            //Select select2=new Select(driver.findElement(By.id("id_country")));
            //select2.selectByVisibleText(strArg1);
            registrationPage.selectCountry(strArg1);

        }

        @And("^user have entered a Additional Information \"([^\"]*)\"$")
        public void user_have_entered_a_additional_information_something(String strArg1) {
           // driver.findElement(By.id("other")).sendKeys(strArg1);
            registrationPage.EnterAdditionalInfo(strArg1);
        }

        @And("^user have entered a Home Phone \"([^\"]*)\"$")
        public void user_have_entered_a_home_phone_something(String strArg1)  {
            //driver.findElement(By.id("phone")).sendKeys(strArg1);
            registrationPage.enterHomePhone(strArg1);
        }

        @And("^user have entered a Mobile Phone as \"([^\"]*)\"$")
        public void user_have_entered_a_mobile_phone_as_something(String strArg1){
            //driver.findElement(By.id("phone_mobile")).sendKeys(strArg1);
            registrationPage.enterMobileNum(strArg1);
        }

        @And("^user have entered in Assign an address alias for future reference text box as \"([^\"]*)\"$")
        public void user_have_entered_in_assign_an_address_alias_for_future_reference_text_box_as_something(String strArg1){
           // driver.findElement(By.id("alias")).clear();
            //driver.findElement(By.id("alias")).sendKeys(strArg1);
            registrationPage.enterAlias(strArg1);
        }

        @And("^user clicks on the Register button$")
        public void user_clicks_on_the_register_button(){
            //driver.findElement(By.id("submitAccount")).click();
            //driver.findElement(By.xpath("//div[3]/div/div/ol/li")).isDisplayed();
            registrationPage.clickRegister();

        }
        @Then("^user account created successfully$")
        public boolean user_account_created_successfully()  {
            //return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).isDisplayed();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return RegistrationPage.loginInfo.isDisplayed();


        }
        @Then("^User should see feedback message as \"([^\"]*)\"$")
        public void user_should_see_feedback_message_as_something(String strArg1) {
           // registrationPage=new RegistrationPage();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Assert.assertEquals(strArg1,loginPage.feedbackMessage.getText());


        }
    }



