package Pages;

import Framework.TestContext.TestContext;
import Pages.HomePage.HomePageSteps;
import Pages.Notifications.NotificationsSteps;
import Pages.Products.ProductsDetailsPage.ProductsDetailsSteps;

public class Application {
    TestContext currentContext;

    public Application(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public HomePageSteps HomePage() {
        return new HomePageSteps(currentContext);
    }

    public ProductsDetailsSteps ProductDetailsPage() {
        return new ProductsDetailsSteps(currentContext);
    }

    public NotificationsSteps Notification(){ return new NotificationsSteps(currentContext);}

}
