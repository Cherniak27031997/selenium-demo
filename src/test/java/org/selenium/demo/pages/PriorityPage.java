package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriorityPage extends GeneralPage {

    public PriorityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"Слой_1\"]")
    private WebElement priorityClick;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement bpriorityClick;

    @Override
    public void click() {
        super.clickOnWebElement(priorityClick);
        super.clickOnWebElement(bpriorityClick);
    }

    @Override
    public void writeText(String text) {
        // nothing here
    }
}
