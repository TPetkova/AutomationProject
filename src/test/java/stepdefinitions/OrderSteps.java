package stepdefinitions;

import helpers.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;

import java.util.List;
import java.util.Map;

public class OrderSteps extends BaseSteps {
    HomePage homePage;
    LoginPage loginPage;
    OrderPage orderPage;

    public OrderSteps(HomePage homePage, Driver driver, LoginPage loginPage, OrderPage orderPage) {
        super(driver, homePage);
        this.homePage = homePage;
        this.loginPage = loginPage;
        this.orderPage = orderPage;
    }

    @Given("a user is logged on the {string} page")
    public void aUserIsLoggedOnThePage(String url) {
        loginPage.navigateToUrl(url);
        loginPage.clickSignInButton();
        loginPage.scrollPage(loginPage.getLoginButton());
        loginPage.login("test_account87@abv.bg", "testAccount87!");
        Assert.assertTrue("The homepage title should be My account - My Shop",homePage.getTitle().equals("My account - My Shop"));
    }

    @And("the user clicks {string} from the main menu")
    public void theUserClicksFromTheMainMenu(String button) {
        switch (button) {
            case "T-Shirts":
                homePage.clickTshirtMenuButton();
                break;
            default:
                throw new IllegalArgumentException("There is no such button: " + button);
        }

    }
    @And("the user selects an item {string} with the following properties:")
    public void theUserSelectsAnItemWithTheFollowingProperties(String item, DataTable dataTable) {
        switch (item) {
            case "Faded Short Sleeve T-shirts":
                homePage.clickFadedTshirtButton();
                homePage.scrollPage(homePage.getAddToCart());
                Map<String,String> columnData = retrieveDataFromTable(dataTable);
                String quantity = columnData.get("Quantity");
                String size = columnData.get("Size");
                String color = columnData.get("Color");
                homePage.clearQuantity();
                homePage.setQuantity(quantity);
                homePage.selectSizeFromDropdown(size);
                homePage.selectColor();
                break;
            default:
                throw new IllegalArgumentException("There is no such item: " + item);
        }

    }

    @Then("the shopping cart on the Home page is updated with the quantity {int} of the selected item")
    public void theShoppingCartOnTheHomePageIsUpdatedWithTheQuantityOfTheSelectedItem(int quantity) {
        homePage.verifyErrorIsDisplayed();
        homePage.clickCloseErrorMessage();
        homePage.scrollPage(homePage.getAddToCart());
        Assert.assertEquals("Total quantity of the ordered products in the shopping cart should be " + quantity, quantity,homePage.getTotalCOuntQuantity().getText());
        if (quantity > 1) {
            Assert.assertEquals("There are more than 1 product", "Products", homePage.getProductsCart().getText());
        } else {
            Assert.assertEquals("There is 1 product", "Product", homePage.getProductCart().getText());
        }
    }

    @And("the selected item is added to the cart with the following properties:")
    public void theSelectedItemIsAddedToTheCartWithTheFollowingProperties(DataTable dataTable) {
        homePage.clickShoppingCart();
        orderPage.scrollPage(orderPage.getOrderedItem());
        Assert.assertEquals("The user should be on order page with title Order - My Shop","Order - My Shop", orderPage.getTitle());
        Assert.assertEquals("Selected item should be Faded Short Sleeve T-shirts", "Faded Short Sleeve T-shirts",orderPage.getOrderedItem().getText());
        Map<String, String> columnData = retrieveDataFromTable(dataTable);
        String quantity = columnData.get("Quantity");
        String size = columnData.get("Size");
        String color = columnData.get("Color");

        Assert.assertEquals("The expected quantity of a product is " + quantity,quantity,orderPage.getOrderedQuantity().getAttribute("value"));
        String expectedProperties = "Size : " + size + ", Color : " + color;
        Assert.assertEquals("The expected properties are " + expectedProperties, expectedProperties, orderPage.getItemProperties().getText() );
    }


}
