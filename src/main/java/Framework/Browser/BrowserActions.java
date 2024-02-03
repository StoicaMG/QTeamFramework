package Framework.Browser;

import Framework.TestContext.TestContext;

public class BrowserActions {
    TestContext currentContext;

    public BrowserActions(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void OpenPage(String url) {
        currentContext.driver.get(url);
    }

    public void RefreshPage() {
        currentContext.driver.navigate().refresh();
    }

    public void GetPageTitle() {
        currentContext.driver.getTitle();
    }
}
