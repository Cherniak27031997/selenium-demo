package org.selenium.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by web_systems on 15.03.2017.
 */
public class Test_websystems extends GeneralTest {

    @Test
    public void startWebDriver() throws InterruptedException {
        //  Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(5);
        homePage.clickHomePage();
        //   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(5);
        namePage.writeName("test");
        namePage.clickName();

        // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(5);
        emailPage.writeEmail("test@mail.com");
        emailPage.clickEmail();
        TimeUnit.SECONDS.sleep(5);
        priorityPage.clickPriority();
        priorityPage.clickBpiority();
        TimeUnit.SECONDS.sleep(5);
        comentPage.writeComent("testtestettetettetettetetettetetet");
        comentPage.clickComent();
        TimeUnit.SECONDS.sleep(5);
        budgetePage.writeBudget("10000000");
        budgetePage.clickBudget();
        TimeUnit.SECONDS.sleep(5);
        finishPage.clickFinish();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("Thanks. We contact with you as soon as possible", driver.findElement(By.cssSelector("p")).getText());


        //  WebElement clientButton = driver.findElement(By.id("btn-colorful"));
        // System.out.println(clientButton);
        // clientButton.click();
        //  Assert.assertTrue("title should start differently",
        //        driver.getTitle().startsWith("Selenium Simplified"));

        //   driver.close();
        // driver.quit();
    }

    // private void someActions(){
    //    homePage.setTextField("Vitaliy");
    //    homePage.clickHomePage();
    // }
}
