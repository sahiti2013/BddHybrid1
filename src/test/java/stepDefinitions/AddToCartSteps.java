package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.*;

import java.util.concurrent.TimeUnit;

import static pages.BasePage.driver;


public class AddToCartSteps {

    public BasePage basePage;
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public HomePage homePage;
    public DressesPage dressesPage;
    public AccountPage accountPage;


    @When("^enters text in search box as \"([^\"]*)\"$")
    public void he_enters_text_as_something_in_search_box(String strArg1)  {
        //When enters text in search box as "<Text>"
        //driver.findElement(By.cssSelector("#search_query_top")).sendKeys("dresses");
      homePage=new HomePage();
      homePage.enterTextInSearch(strArg1);

    }


    @And("^clicks search button$")
    public void clicks_search_button() {
        //driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        homePage.clickSearch();

    }
    @Then("^user should see dresses displayed on the page$")
    public boolean user_should_see_dresses_displayed_on_the_page()  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //return driver.findElement(By.xpath("//span[@class='lighter']")).isDisplayed();
        dressesPage=new DressesPage();
        return dressesPage.dressesDisplay();
    }

    @When("^user clicks Add To Cart button$")
    public void user_clicks_add_to_cart_button()  {
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
        dressesPage.clickAddToCartBtn();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @And("^Clicks Continue Shopping$")
    public void clicks_continue_shopping()  {
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
        dressesPage.clickContinueShopping();

    }

    @And("^again Clicks Add To Cart button$")
    public void again_clicks_add_to_cart_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
        dressesPage.clickAddToCartBtn();

    }

    @And("^Clicks Proceed To checkout button$")
    public void clicks_proceed_to_checkout_button()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        dressesPage.ClickProceedToCheckout();

    }

    @Then("^user should see Summary of the items added successfully$")
    public boolean user_should_see_summary_of_the_items_added_successfully() {
        //driver.findElement(By.cssSelector("#cart_title")).isDisplayed();
        accountPage=new AccountPage();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return accountPage.summaryDisplay();


    }





}

