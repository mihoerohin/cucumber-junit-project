package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TC4SmartBearOrderProcessPage {

    public TC4SmartBearOrderProcessPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderBtn;

    public void login (String username, String password){
        usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginBtn.click();
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement selectProduct;

    public void setSelectProduct(String setProduct){
        Select select = new Select(selectProduct);
        select.selectByValue(setProduct);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;
    public void setQuantityBox(String setQuantityNumber){
        quantityBox.sendKeys(Keys.BACK_SPACE, setQuantityNumber);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;



    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//td")

    public List<WebElement> cardList;
    public void setCardList(String selectCard){
        for(WebElement element : cardList){
            if (element.getText().equals(selectCard)){
                element.click();
            }
        }
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrdersBtn;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr")
    public List<WebElement> list;
    public boolean listOfAllOrders(String name){
        for(WebElement element : list){
            if (element.getText().contains(name)){
                return true;
            }
        }
        return false;
    }
}