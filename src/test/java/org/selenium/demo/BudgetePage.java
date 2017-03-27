package org.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 17.03.2017.
 */
public class BudgetePage {
    private WebDriver driver;
    public BudgetePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "q5")
    private WebElement budgetwrite;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement budgetclick;

    public void writeBudget(String text){
        budgetwrite.sendKeys(text);
    }
    public void clickBudget(){
        budgetclick.click();
    }
}
