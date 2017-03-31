package org.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class GeneralPage implements Page {

    protected WebDriver driver;

    GeneralPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private void waitElement() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void click(WebElement element) {
        waitElement();
        element.click();
    }

    protected void writeText(WebElement element, String text) {
        waitElement();
        element.sendKeys(text);
    }
}
