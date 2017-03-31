package org.selenium.demo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.demo.utils.ChromeDriverInit;

public class ChromeTest extends ChromeDriverInit {

    /**
     * The following code is for the Chrome Driver
     * You also need to download the ChromeDriver executable
     * https://sites.google.com/a/chromium.org/chromedriver/
     */
    @Test
    public void testChromeDriver() {
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Selenium Simplified"));
    }

    @Test
    @Ignore
    public void testFirefox(){
        /* String currentDir = System.getProperty("user.dir");
           String chromeDriverLocation = currentDir + "/tools/chromedriver/chromedriver.exe";
           System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
         */
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Selenium Simplified"));
    }

}
