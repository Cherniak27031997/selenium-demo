package org.selenium.demo.utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InputStream;
import java.util.Properties;

public abstract class ChromeDriverInit {

    protected WebDriver driver;

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
}
