package com.cydeo.step_definitions;

import com.cydeo.pages.TC4SmartBearOrderProcessPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC4SmartBearOrderProcessDefStep {

    TC4SmartBearOrderProcessPage bearOrderPage = new TC4SmartBearOrderProcessPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void userIsLoggedIntoSmartBearTesterAccountAndOnOrderPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.smartBear.url"));
        bearOrderPage.login("smartBear.username","smartBear.password");
        bearOrderPage.orderBtn.click();  // on Order page
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String selectProduct) {
        bearOrderPage.setSelectProduct(selectProduct);
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String enterQuantity) {
        bearOrderPage.setQuantityBox(enterQuantity);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String costumerName) {
        bearOrderPage.customerNameBox.sendKeys(costumerName);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        bearOrderPage.streetBox.sendKeys(street);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        bearOrderPage.cityBox.sendKeys(city);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        bearOrderPage.stateBox.sendKeys(state);
    }
    @When("User enters {string}")
    public void user_enters(String zip) {
        bearOrderPage.zipBox.sendKeys(zip);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
        bearOrderPage.setCardList(cardType);
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        bearOrderPage.cardNumberBox.sendKeys(cardNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expirationDate) {
        bearOrderPage.expireDateBox.sendKeys(expirationDate);
    }
    @When("User clicks process button")
    public void user_clicks_process_button(){
        bearOrderPage.processBtn.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedTheList) {
        bearOrderPage.viewAllOrdersBtn.click();                     //  to  "List of All Orders" page
        Assert.assertTrue(bearOrderPage.listOfAllOrders(expectedTheList));
    }
}