package Pages.HomePage;

import Framework.Selenium.BrowserFactory;
import Framework.TestContext.TestContext;
import Pages.Products.ProductsCard.ProductsCardSteps;
import Pages.Notifications.NotificationsSteps;

public class HomePageSteps extends HomePageElements {

    public ProductsCardSteps ProductCard(){ return new ProductsCardSteps(currentContext);}

    public HomePageSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }


    public HomePageSteps UserIsOnHomePage() {
        BrowserFactory.OpenPage(currentContext.driver, "https://magento.softwaretestingboard.com/");
        return this;
    }
}