package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableUserOrderPage {

    public WebTableUserOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(name = "product")
    public WebElement product;

    @FindBy(name = "quantity")
    public WebElement quantityBox;

    @FindBy(name = "name")
    public WebElement customerNameBox;

    @FindBy(name = "street")
    public WebElement streetBox;

    @FindBy(name = "city")
    public WebElement cityBox;

    @FindBy(name = "state")
    public WebElement stateBox;

    @FindBy(name = "zip")
    public WebElement zipcodeBox;

    @FindBy(name = "card")
    public List<WebElement> selectCardType;

    @FindBy(name = "cardNo")
    public WebElement creditCardNumberBox;

    @FindBy(name = "cardExp")
    public WebElement expiryDateBox;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processBtn;



}
