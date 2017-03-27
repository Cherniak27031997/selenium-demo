package org.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 17.03.2017.
 */
public class NamePage {
    private WebDriver driver;
    public NamePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "q1")
    private WebElement nametext;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement nameclick;

    public void writeName(String text) {
        nametext.sendKeys(text);
    }
    public void clickName () {
        nameclick.click();
    }
}
