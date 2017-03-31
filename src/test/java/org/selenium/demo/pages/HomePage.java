package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends GeneralPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn-colorful")
    private WebElement clientButton;

    @Override
    public void click() {
        super.clickOnWebElement(clientButton);
    }

    @Override
    public void writeText(String text) {
        // nothing here
    }
}
