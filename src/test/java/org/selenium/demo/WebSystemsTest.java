package org.selenium.demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.selenium.demo.utils.WebSystemsPages;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class WebSystemsTest extends WebSystemsPages {

    @Test
    public void testCreateNewProject() throws InterruptedException {
        driver.navigate().to("https://web-systems.solutions");
        populateInformation();
        assertEquals("Thanks. We contact with you as soon as possible", driver.findElement(By.cssSelector("p")).getText());
    }

    private void populateInformation() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        homePage.clickHomePage();
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
        budgetePage.writeText("10000000");
        budgetePage.click();
        cityPage.writeText("test");
        cityPage.click();
        TimeUnit.SECONDS.sleep(5);
        finishPage.clickFinish();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("en")).click();
        TimeUnit.SECONDS.sleep(5);
    }

}

