package Steps.BrowserSteps;

import Framework.Selenium.BrowserFactory;
import Framework.TestContext.TestContext;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

public class BrowserActions{
    TestContext currentContext;

    public BrowserActions(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void OpenPage(String url) {
        currentContext.browser.driver.get(url);
    }
}
