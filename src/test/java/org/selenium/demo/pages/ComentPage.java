package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 17.03.2017.
 */
public class ComentPage {
    private WebDriver driver;
    public ComentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "q4")
    private WebElement comenttext;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement comentclick;

    public void writeComent(String text){
        comenttext.sendKeys(text);
    }
    public void  clickComent(){
        comentclick.click();
    }
}
