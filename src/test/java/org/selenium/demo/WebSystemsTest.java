package org.selenium.demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.selenium.demo.utils.WebSystemsPages;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by web_systems on 15.03.2017.
 */
public class WebSystemsTest extends WebSystemsPages {

    @Test
    public void testCreateNewProject() throws InterruptedException {
        //  Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(5);
        homePage.clickHomePage();
        //   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(5);
        namePage.writeName("test");
        namePage.clickName();
        TimeUnit.SECONDS.sleep(5);
        emailPage.writeEmail("test@mail.com");
        emailPage.clickEmail();
        TimeUnit.SECONDS.sleep(5);
        priorityPage.clickPriority();
        priorityPage.clickBpiority();
        TimeUnit.SECONDS.sleep(5);
        comentPage.writeComent("testtestettetettetettetetettetetet");
        comentPage.clickComent();
//        TimeUnit.SECONDS.sleep(5);
        budgetePage.writeText("10000000");
        budgetePage.click();
        TimeUnit.SECONDS.sleep(5);
        cityPage.writeCity("test");
        cityPage.clickCity();
        TimeUnit.SECONDS.sleep(5);
        finishPage.clickFinish();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("en")).click();
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

