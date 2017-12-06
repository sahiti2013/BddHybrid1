package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends BasePage {
    @FindBy(xpath = "//span[@class='lighter']")
    WebElement displayDresses;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartBtn;
    @FindBy(xpath = "//span[@title='Continue shopping']")
    WebElement continueShoppingBtn;
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    WebElement ProceedToCheckoutBtn;


    public DressesPage() {
        PageFactory.initElements(driver, this);
    }


    public boolean dressesDisplay() {
        //return driver.findElement(By.xpath("//span[@class='lighter']")).isDisplayed();
        return displayDresses.isDisplayed();
    }

    public void clickAddToCartBtn() {
        //*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span
        addToCartBtn.click();
    }

    public void clickContinueShopping() {
        //driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
        continueShoppingBtn.click();
    }

    public void ClickProceedToCheckout() {
//driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();    }
        ProceedToCheckoutBtn.click();
    }
}
