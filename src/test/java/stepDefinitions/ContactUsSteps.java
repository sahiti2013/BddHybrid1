package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsSteps {
    HomePage homePage=new HomePage();
    ContactUsPage contactUsPage=new ContactUsPage();

    @When("^user Clicks Contact Us button$")
    public void user_Clicks_Contact_Us_button(){
        homePage.selectContactUS();
    }

    @Then("^user should see contactUs page\\.$")
    public boolean user_should_see_contactUs_page()  {
        return contactUsPage.contactUsPageTitle();
    }

    /*@Given("^as user on ContactUs page\\.$")
    public void as_user_on_ContactUs_page()  {

    }*/

    @When("^user selects Subject Heading as \"([^\"]*)\"$")
    public void user_selects_Subject_Heading_as(String arg1)  {
       contactUsPage.selectHeading(arg1);
    }

    @When("^user enters Email as \"([^\"]*)\"$")
    public void user_enters_Email_as(String arg1) throws Throwable {
contactUsPage.typeEmail(arg1);
    }

    @When("^selects order refrence as \"([^\"]*)\"$")
    public void selects_order_refrence_as(String arg1)  {
contactUsPage.typeOrderRefrence(arg1);

    }

    @When("^attaches file \"([^\"]*)\"$")
    public void attaches_file(String arg1) {
        contactUsPage.attachFile(arg1);

    }

    @When("^enters Message as \"([^\"]*)\"$")
    public void enters_Message_as(String arg1)  {
contactUsPage.typeMessage(arg1);
    }

    @When("^clicks Send button$")
    public void clicks_Send_button() {
contactUsPage.clickSendBtn();
    }

    @Then("^user should see Feedback message as \"([^\"]*)\"$")
    public void user_should_see_Feedback_message_as(String arg1)  {
       Assert.assertEquals(ContactUsPage.feedbackMessage.getText(),arg1);
    }



}
