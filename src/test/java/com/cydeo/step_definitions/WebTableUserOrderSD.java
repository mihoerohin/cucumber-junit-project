package com.cydeo.step_definitions;

import com.cydeo.pages.AllOrdersPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTableUserOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableUserOrderSD {

    WebTableUserOrderPage webTablePage = new WebTableUserOrderPage();

    AllOrdersPage allOrdersPage = new AllOrdersPage();

    BasePage basePage = new BasePage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page(){
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webTablePage.usernameBox.sendKeys(ConfigurationReader.getProperty("web.app.username"));
        webTablePage.passwordBox.sendKeys(ConfigurationReader.getProperty("web.app.password"));
        webTablePage.loginBtn.click();
        basePage.orderBtn.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String selectProduct){
        Select select = new Select(webTablePage.product);
        select.selectByVisibleText(selectProduct);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer entersQuantity) {
        webTablePage.quantityBox.clear();
       webTablePage.quantityBox.sendKeys(entersQuantity+"");
     //  OR  webTablePage.quantityBox.sendKeys(String.copyValueOf(entersQuantity));

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        webTablePage.customerNameBox.sendKeys(name);

    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTablePage.streetBox.sendKeys(street);

    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTablePage.cityBox.sendKeys(city);

    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTablePage.stateBox.sendKeys(state);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        webTablePage.zipcodeBox.sendKeys(zipcode);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String card) {
        List<WebElement> elements = webTablePage.selectCardType;
        for (WebElement each : elements){
            if (each.getAttribute("value").equalsIgnoreCase(card)){
                each.click();
            }
        }

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber){
        webTablePage.creditCardNumberBox.sendKeys(cardNumber);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expiryDate) {
        webTablePage.expiryDateBox.sendKeys(expiryDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button(){
        webTablePage.processBtn.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName){
        basePage.ViewAllOrdersBtn.click();
        String actualName = allOrdersPage.firstElement.getText();
        Assert.assertEquals(expectedName, actualName);

    }

}
