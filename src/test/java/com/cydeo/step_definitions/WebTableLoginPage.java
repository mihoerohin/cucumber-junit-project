package com.cydeo.step_definitions;

import com.cydeo.pages.WebAppCydeoPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginPage {

    WebAppCydeoPage webAppCydeoPage = new WebAppCydeoPage();

    @When("user enters username {string}, password {string} and login")
    public void userEntersUsernamePasswordAndLogin(String username, String password) {
        webAppCydeoPage.login(username, password);
    }

    @Given("user is in web table login page")
    public void user_is_in_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webAppCydeoPage.usernameBox.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webAppCydeoPage.passwordBox.sendKeys(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webAppCydeoPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {


        webAppCydeoPage.usernameBox.sendKeys(ConfigurationReader.getProperty(credentials.get("username")));
        webAppCydeoPage.usernameBox.sendKeys(ConfigurationReader.getProperty(credentials.get("password")));
        webAppCydeoPage.loginBtn.click();

    }


    @When("user enters below credentials new")
    public void userEntersBelowCredentialsNew(Map<String, String> credentials) {
                            // Test Tester
        String[] janna = credentials.get("Janna").split(" ");
        webAppCydeoPage.usernameBox.sendKeys(janna[0]);
        webAppCydeoPage.passwordBox.sendKeys(janna[1]);
        webAppCydeoPage.loginBtn.click();
    }

}
