package org.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by web_systems on 16.03.2017.
 */
public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
   @FindBy(id = "btn-colorful")
   private WebElement clientButton;



    public void clickHomePage() {
        clientButton.click();
    }


}
