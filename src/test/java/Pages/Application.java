package Pages;

import Framework.TestContext.TestContext;
import Pages.HomePage.HomePageActions;
import Pages.ProductsPage.ProductsPageActions;

public class Application {
    TestContext currentContext;

    public Application(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public HomePageActions HomePage(){
        return new HomePageActions(currentContext);
    }

    public ProductsPageActions ProductPage(){
        return new ProductsPageActions(currentContext);
    }
}
