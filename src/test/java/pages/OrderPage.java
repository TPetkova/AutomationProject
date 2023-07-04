package pages;

import helpers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage extends BasePage{

    public OrderPage(Driver baseDriver) {
        super(baseDriver);
    }

    @FindBy(xpath = "//td[@class='cart_description']//p[@class='product-name']//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    private WebElement orderedItem;

    @FindBy(xpath = "//td[@class='cart_description']//small//a") private WebElement itemProperties;

    @FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']") private WebElement orderedQuantity;



    public String getTitle() {
        return super.getDriver().getTitle();
    }

    public WebElement getOrderedItem() {
        return orderedItem;
    }

    public WebElement getItemProperties() {
        return itemProperties;
    }

    public WebElement getOrderedQuantity() {
        return orderedQuantity;
    }

}
