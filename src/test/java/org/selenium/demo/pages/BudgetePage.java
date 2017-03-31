package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by web_systems on 17.03.2017.
 */
public class BudgetePage extends GeneralPage {

    @FindBy(id = "q5")
    private WebElement budgetwrite;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement budgetclick;

    public BudgetePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void click() {
        super.click(budgetclick);
    }

    @Override
    public void writeText(String text) {
        super.writeText(budgetwrite, text);
    }
}
