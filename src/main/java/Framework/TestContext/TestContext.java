package Framework.TestContext;

import Framework.Selenium.BrowserFactory;

public class TestContext {
    public BrowserFactory browser;

    public void StartTest() {
        browser = new BrowserFactory();
        System.out.println(browser.driver);
    }

    public void EndTest() {
        System.out.println(browser.driver);
        BrowserFactory.QuitBrowser(this.browser.driver);
    }
}
