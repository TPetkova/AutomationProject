package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import helpers.Driver;
import pages.BasePage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseSteps {

    private WebDriver driver;
    private BasePage page;
    public BaseSteps(Driver driver, BasePage page){
        this.driver=driver.getDriver();
        this.page=page;
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public Map<String, String> retrieveDataFromTable(DataTable dataTable) {
        List<Map<String, String>> tableData = dataTable.asMaps(String.class, String.class);

        Map<String, String> columnData = new HashMap<>();

        for (Map<String, String> row : tableData) {
            for (String columnName : row.keySet()) {
                String columnValue = row.get(columnName);
                columnData.put(columnName, columnValue);
            }
        }

        return columnData;
    }



}
