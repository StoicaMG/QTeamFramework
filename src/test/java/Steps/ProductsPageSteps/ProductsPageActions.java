package Steps.ProductsPageSteps;

import Framework.TestContext.TestContext;
import Steps.BrowserSteps.BrowserActions;

public class ProductsPageActions {
    public static void UserIsOnProductsPage(TestContext currentContext) {
        BrowserActions browser = new BrowserActions(currentContext);
        browser.OpenPage("https://magento.softwaretestingboard.com/radiant-tee.html");
    }
}
