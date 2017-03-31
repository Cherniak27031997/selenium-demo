package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NamePage extends GeneralPage {

    public NamePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "q1")
    private WebElement nameText;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement nameClick;

    @Override
    public void click() {
        super.clickOnWebElement(nameClick);
    }

    @Override
    public void writeText(String text) {
        super.writeToWebElement(nameText, text);
    }
}
