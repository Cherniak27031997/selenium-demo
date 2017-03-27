package org.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 17.03.2017.
 */
public class EmailPage {
    private WebDriver driver;
    public EmailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id="q2")
    private WebElement emailtext;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement emailclick;

    public void writeEmail(String text){
        emailtext.sendKeys(text);

    }
    public void clickEmail(){
        emailclick.click();
    }
}
