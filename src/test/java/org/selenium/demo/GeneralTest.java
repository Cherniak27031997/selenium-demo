package org.selenium.demo;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by web_systems on 17.03.2017.
 */
public class GeneralTest {

    public HomePage homePage;
    public NamePage namePage;
    public EmailPage emailPage;
    public PriorityPage priorityPage;
    public ComentPage comentPage;
    public BudgetePage budgetePage;
    public FinishPage finishPage;
    public WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        initPages();
        driver.navigate().to("https://web-systems.solutions");
    }

    private void initPages() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        namePage = new NamePage(driver);
        emailPage = new EmailPage(driver);
        priorityPage = new PriorityPage(driver);
        comentPage = new ComentPage(driver);
        budgetePage = new BudgetePage(driver);
        finishPage = new FinishPage(driver);

    }
}
