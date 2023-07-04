package pages;

import helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    public BasePage(Driver baseDriver) {
        this.driver=baseDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void navigateToUrl(String url) {
        this.driver.get(url);
        //driver.manage().window().maximize();
    }

    public void click(WebElement element) {
        element.click();
    }

    public void scrollPage(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
    }
}
