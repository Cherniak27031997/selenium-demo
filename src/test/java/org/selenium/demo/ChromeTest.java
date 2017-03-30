package org.selenium.demo;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.InputStream;
import java.util.Properties;

public class ChromeTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        Properties properties = initProperties();
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
        driver = initDriver();
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    private WebDriver initDriver() {
        return new ChromeDriver();
    }

    private Properties initProperties() {
        Properties properties = new Properties();
        try {
            InputStream fileInputStream = getClass().getClassLoader().getResourceAsStream("pom.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return properties;
    }

    /** The following code is for the Chrome Driver
     You also need to download the ChromeDriver executable
     https://sites.google.com/a/chromium.org/chromedriver/
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
