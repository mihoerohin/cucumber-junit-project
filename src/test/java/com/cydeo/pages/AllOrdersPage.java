package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOrdersPage extends BasePage{


    @FindBy(xpath = "//table[@class='table is-fullwidth']//tbody//tr[1]//td[1]")
    public WebElement firstElement;
}
