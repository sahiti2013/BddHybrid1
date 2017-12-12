import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/featureFiles/",
            tags ={"@EnterInvalidEmail,@AddTOCart"},
            format = {"json:target/cucumber.json","html:target/CucumberHTMLReports"})
    public class TestRunner {


    }
