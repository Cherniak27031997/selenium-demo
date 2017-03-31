package org.selenium.demo.utils;

import org.junit.Before;
import org.selenium.demo.pages.*;

public class WebSystemsPages extends ChromeDriverInit {

    protected HomePage homePage;
    protected NamePage namePage;
    protected EmailPage emailPage;
    protected PriorityPage priorityPage;
    protected ComentPage comentPage;
    protected Page budgetePage;
    protected FinishPage finishPage;
    protected CityPage cityPage;

    @Before
    public void setUp() {
        super.setUp();
        initPages();
        driver.navigate().to("https://web-systems.solutions");
    }

    private void initPages() {
        homePage = new HomePage(driver);
        namePage = new NamePage(driver);
        emailPage = new EmailPage(driver);
        priorityPage = new PriorityPage(driver);
        comentPage = new ComentPage(driver);
        budgetePage = new BudgetePage(driver);
        finishPage = new FinishPage(driver);
        cityPage = new CityPage(driver);
    }

//    public void wait(page) {
//        page.navigate();
//    }
}
