package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;
import helpers.Driver;

public class LoginSteps extends BaseSteps {
    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps(LoginPage loginPage, Driver driver, HomePage homePage) {
        super(driver, loginPage);
        this.loginPage = loginPage;
        this.homePage = homePage;
    }

    @Given("a user is on the {string} page")
    public void aUserIsOnThePage(String url) {
        loginPage.navigateToUrl(url);
    }

    @And("the user clicks {string} from the menu")
    public void theUserClicksFromTheMenu(String button) {
        switch (button) {
            case "Sign in":
                loginPage.clickSignInButton();
                break;
            default:
                throw new IllegalArgumentException("There is no such button: " + button);
        }
    }

    @And("the user enters valid credentials")
    public void theUserEntersValidCredentials(DataTable dataTable) {
        loginPage.scrollPage(loginPage.getLoginButton());
        Map<String,String> columnData = retrieveDataFromTable(dataTable);
        String email = columnData.get("Email");
        String password = columnData.get("Password");
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }

    @When("the user clicks {string} button on the {string} page")
    public void theUserClicksButtonOnThePage(String button, String page) {
        if ((button.equalsIgnoreCase("Sign in")) & (page.equalsIgnoreCase("Login"))) {
                loginPage.clickLoginButton();
        } else if((button.equalsIgnoreCase("Add to cart")) & (page.equalsIgnoreCase("Home"))) {
            homePage.clickAddToCartButton();
        }
    }

    @Then("the user is redirected to the {string} page")
    public void theUserIsRedirectedToThePage(String page) {
        switch (page) {
            case "Home":
                Assert.assertTrue("The homepage title should be My account - My Shop",homePage.getTitle().equals("My account - My Shop"));
                break;
            default:
                throw new IllegalArgumentException("There is no such page: " + page);
        }
    }
}
