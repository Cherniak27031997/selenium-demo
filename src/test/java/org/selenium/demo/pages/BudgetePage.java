package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BudgetePage extends GeneralPage {

    @FindBy(id = "q5")
    private WebElement budgetText;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement budgetClick;

    public BudgetePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void click() {
        super.click(budgetClick);
    }

    @Override
    public void writeText(String text) {
        super.writeText(budgetText, text);
    }
}
