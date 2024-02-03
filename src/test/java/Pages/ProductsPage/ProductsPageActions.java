package Pages.ProductsPage;

import Framework.TestContext.TestContext;

public class ProductsPageActions {
    TestContext currentContext;

    public ProductsPageActions(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void UserIsOnProductsPage() {
        currentContext.driver.get("https://magento.softwaretestingboard.com/radiant-tee.html");
    }
}
