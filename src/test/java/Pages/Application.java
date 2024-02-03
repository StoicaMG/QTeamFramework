package Pages;

import Framework.TestContext.TestContext;
import Pages.HomePage.HomePageActions;
import Pages.ProductsPage.ProductsPageActions;
import Pages.WhatIsNewPage.WhatIsNewPageActions;

public class Application {
    TestContext currentContext;

    public Application(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public HomePageActions HomePage() {
        return new HomePageActions(currentContext);
    }

    public ProductsPageActions ProductPage() {
        return new ProductsPageActions(currentContext);
    }

    public WhatIsNewPageActions WhatIsNewPage() {
        return new WhatIsNewPageActions(currentContext);
    }
}
