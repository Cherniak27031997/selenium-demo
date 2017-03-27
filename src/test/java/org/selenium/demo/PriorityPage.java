package org.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 17.03.2017.
 */
public class PriorityPage {
    private WebDriver driver;
    public PriorityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@id=\"Слой_1\"]")
    private WebElement priorityclick;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement bpriorityclick;

    public void clickPriority(){
        priorityclick.click();
    }
    public void clickBpiority(){
        bpriorityclick.click();
    }
}
