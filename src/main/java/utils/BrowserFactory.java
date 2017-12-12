package utils;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.BasePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utils.AutomationConstants.*;

public class BrowserFactory extends BasePage {
    //C:\BddHybrid1\src\main\resources\chromedriver.exe
    //public static WebDriver driver;
    public static void startBrowser() {
        String path = System.getProperty("user.dir") + "/src/main/resources/";
        if (AutomationConstants.remoteBrowser == true) {
            System.out.println("selenium grid is running");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.WIN10);
            caps.setBrowserName("chrome");
            caps.setVersion("");
            /*DesiredCapabilities caps = DesiredCapabilities.safari();
            caps.setCapability("platform", "macOS 10.12");
            caps.setCapability("version", "11.0");*/
            try {


                driver = new RemoteWebDriver(new URL(AutomationConstants.gridUrl),caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


        } else {
            if (AutomationConstants.browserType.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (AutomationConstants.browserType.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
                driver = new ChromeDriver();
            } else if (AutomationConstants.browserType.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", path + "IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            //driver.get(AutomationConstants.baseURL);
            //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        }
        driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }


    public static void stopBrowser() {
        if (driver != null) {
            driver.close();
            driver.quit();

        }

    }

    public static WebDriver getBrowser() {
        if (driver == null) {
            BrowserFactory.startBrowser();

        }

        return driver;
    }
}



