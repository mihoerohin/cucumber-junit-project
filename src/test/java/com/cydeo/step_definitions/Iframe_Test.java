package com.cydeo.step_definitions;

import com.cydeo.pages.ToolsQA;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Iframe_Test {

    ToolsQA toolsQA = new ToolsQA();

    @Given("Advisor on login page {string} and should click Alerts, Frame & Windows button")
    public void advisor_on_login_page_and_should_click_alerts_frame_windows_button(String URL){
        Driver.getDriver().get(URL);
        toolsQA.alertsFrameWindowsBtn.click();
    }
    @When("Advisor should clink button Frames")
    public void advisor_should_clink_button_frames(){
        toolsQA.framesBtn.click();
    }
    @When("Get text from  bigger iframe {string}")
    public void get_text_from_bigger_iframe(String expectedText) throws InterruptedException {
        Driver.getDriver().switchTo().frame(toolsQA.bigFrame1);
        Assert.assertEquals(expectedText, toolsQA.text1.getText());

    }
    @When("Get text from smaller iframe {string}")
    public void get_text_from_smaller_iframe(String expectedText) {
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame(toolsQA.smallFrame2);
        Assert.assertEquals(expectedText, toolsQA.text2.getText());
    }
    @Then("Advisor should click Nested Frames")
    public void advisor_should_click_nested_frames() {
        Driver.getDriver().switchTo().defaultContent();
        toolsQA.nestedFramesBtn.click();

    }
    @Then("Get text from smaller {string}")
    public void get_text_from_smaller(String expectedText) {
        Driver.getDriver().switchTo().frame(toolsQA.nestedFrame1);
        Driver.getDriver().switchTo().frame(toolsQA.nestedFrame2);
        Assert.assertEquals(expectedText, toolsQA.nestedText2.getText());
    }
    @Then("Get text from bigger {string}")
    public void get_text_from_bigger(String expectedText) {
        Driver.getDriver().switchTo().parentFrame();
        Assert.assertEquals(expectedText, toolsQA.nestedText1.getText());
    }
    @Then("Get get first sentence from Nested Frames {string}")
    public void get_get_first_sentence_from_nested_frames(String expectedText) {
        Driver.getDriver().switchTo().defaultContent();
        Assert.assertTrue(toolsQA.textFromPage.getText().startsWith(expectedText));

    }

}
