package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


   @Before
   public void setUpScenario(){
       System.out.println("--> It's coming from @Before in Hooks ");
   }

   @After
    public void teardownScenario( Scenario scenario){
       System.out.println("--> It's coming from @After in Hooks ");

       byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
       scenario.attach(screenshot, "image/png", scenario.getName());

       Driver.closeDriver();
   }

}
