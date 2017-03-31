package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends GeneralPage {

    public FinishPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/form/button")
    private WebElement finishClick;

    @FindBy(id = "en")
    private WebElement changeLocal;

    @Override
    public void click() {
        clickOnWebElement(finishClick);
        clickOnWebElement(changeLocal);
    }

    @Override
    public void writeText(String text) {
        // nothing here
    }
}
