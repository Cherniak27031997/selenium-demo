package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 17.03.2017.
 */
public class FinishPage {
    private WebDriver driver;
    public FinishPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/form/button")
    private WebElement finishclick;

     public void clickFinish(){
         finishclick.click();
     }

}
