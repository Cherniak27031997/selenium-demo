package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by web_systems on 29.03.2017.
 */
public class CityPage extends GeneralPage {

    public CityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "q6")
    private WebElement cityText;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div[2]/div[1]/button")
    private WebElement cityClick;

    @Override
    public void click() {
        super.click(cityClick);
    }

    @Override
    public void writeText(String text) {
        super.writeText(cityText, text);
    }
}
