package com.cydeo.step_definitions;

import com.cydeo.pages.WebEtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebEtsyPage_steps {
    WebEtsyPage webEtsyPage = new WebEtsyPage();

    @Given("User should be on etsy page")
    public void user_should_be_on_etsy_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.etsy.page"));
    }
    @Then("User sees title is as expected {string}")
    public void user_sees_title_is_as_expected(String title) {
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String text) {
        webEtsyPage.searchBox.sendKeys(text);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        webEtsyPage.searchBtn.click();
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String titleText) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(titleText));

    }
}
