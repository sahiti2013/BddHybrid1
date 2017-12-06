package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.BrowserFactory.driver;

public class Utils extends BrowserFactory {

    public static WebDriverWait wait;

    public static boolean isElementPresent(By element) {
        return driver.findElement(element).isDisplayed();
    }

    public static void selectFromList(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    public static void scrollbyY(WebElement ele) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ele.getLocation().y + ")");

    }

    public static void waitForElementVisible(WebElement element,int time) {
        wait = new WebDriverWait(driver,AutomationConstants.timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void selectFromListByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }

    public static void selectFromList2(By element, String val) {
        Select select = new Select(driver.findElement(element));
        select.selectByValue(val);
    }
}
