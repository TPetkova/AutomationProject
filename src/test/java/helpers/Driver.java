package helpers;

import org.openqa.selenium.WebDriver;

public class Driver {

    private WebDriver driver;

    public Driver(){
        BrowserFactory factory = new BrowserFactory();
        this.driver = factory.getBrowser("chrome");
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
