package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends GeneralPage{

    public EmailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="q2")
    private WebElement emailText;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement emailClick;

    @Override
    public void click() {
        super.clickOnWebElement(emailClick);
    }

    @Override
    public void writeText(String text) {
        super.writeToWebElement(emailText, text);
    }
}
