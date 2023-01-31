package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA {

    public ToolsQA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][3]")
    public WebElement alertsFrameWindowsBtn;

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesBtn;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    public WebElement nestedFramesBtn;

    @FindBy(xpath = "//iframe[@id='frame1']")
    public WebElement bigFrame1;

    @FindBy(id = "sampleHeading")
    public WebElement text1;

    @FindBy(xpath = "//iframe[@id='frame2']")
    public WebElement smallFrame2;

    @FindBy(id = "sampleHeading")
    public WebElement text2;

    @FindBy(xpath = "//iframe[@id='frame1']")
    public WebElement nestedFrame1;

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']/..")
    public WebElement nestedText1;

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    public WebElement nestedFrame2;

    @FindBy(xpath = "/html/body/p")
    public WebElement nestedText2;

    @FindBy(id = "framesWrapper")
    public WebElement textFromPage;



}
