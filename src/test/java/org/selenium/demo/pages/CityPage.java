package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 29.03.2017.
 */
public class CityPage {
    private WebDriver driver;
    public CityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "q6")
    private WebElement citytext;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement cityclick;

    public void writeCity(String text){
        citytext.sendKeys(text);

    }
    public void clickCity(){
        cityclick.click();
    }
}
