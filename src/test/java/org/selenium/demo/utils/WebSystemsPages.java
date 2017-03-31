package org.selenium.demo.utils;

import org.junit.Before;
import org.selenium.demo.pages.*;

public class WebSystemsPages extends ChromeDriverInit {

    protected Page homePage;
    protected Page namePage;
    protected Page emailPage;
    protected Page priorityPage;
    protected Page comentPage;
    protected Page budgetePage;
    protected Page finishPage;
    protected Page cityPage;

    @Before
    public void setUp() {
        super.setUp();
        initPages();
    }

    private void initPages() {
        homePage = new HomePage(driver);
        namePage = new NamePage(driver);
        emailPage = new EmailPage(driver);
        priorityPage = new PriorityPage(driver);
        comentPage = new CommentPage(driver);
        budgetePage = new BudgetPage(driver);
        finishPage = new FinishPage(driver);
        cityPage = new CityPage(driver);
    }

}
