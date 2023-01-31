package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("Janna is hungry")
    public void janna_is_hungry() {
        System.out.println("It is from Given");
    }
    @When("She eats some cucumbers")
    public void she_eats_some_cucumbers() {
        System.out.println("It is from When");
    }
    @Then("She will be full")
    public void she_will_be_full() {
        System.out.println("It is from Then");
    }

}
