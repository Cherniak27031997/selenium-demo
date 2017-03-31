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
        homePage.click();
        namePage.writeText("test");
        namePage.click();
        emailPage.writeText("test@mail.com");
        emailPage.click();
        priorityPage.click();
        comentPage.writeText("testtestettetettetettetetettetetet");
        comentPage.click();
        budgetePage.writeText("10000000");
        budgetePage.click();
        cityPage.writeText("test");
        cityPage.click();
        finishPage.click();
        TimeUnit.SECONDS.sleep(5);
    }

}

