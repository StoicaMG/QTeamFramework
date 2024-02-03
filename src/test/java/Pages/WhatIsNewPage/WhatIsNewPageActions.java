package Pages.WhatIsNewPage;

import Framework.TestContext.TestContext;

public class WhatIsNewPageActions {
    TestContext currentContext;

    public WhatIsNewPageActions(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void UserIsOnWhatIsNewPage() {
        currentContext.driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
    }
}
