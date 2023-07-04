package helpers;

import helpers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver driver;
    public Hooks(Driver driver){
        this.driver=driver.getDriver();
    }

    @Before
    public void setup() {
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
