package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentPage extends GeneralPage {

    public CommentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "q4")
    private WebElement commentText;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement commentClick;

    @Override
    public void click() {
        super.clickOnWebElement(commentClick);
    }

    @Override
    public void writeText(String text) {
        super.writeToWebElement(commentText, text);
    }
}
