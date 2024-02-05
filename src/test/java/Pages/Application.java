package Pages;

import Framework.TestContext.TestContext;
import Pages.CartModal.CartModalSteps;
import Pages.CheckoutPage.CheckoutPageSteps;
import Pages.HomePage.HomePageSteps;
import Pages.NavigationMenu.NavigationMenuSteps;
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

    public NotificationsSteps Notification() {
        return new NotificationsSteps(currentContext);
    }

    public NavigationMenuSteps HeaderNavigation() {
        return new NavigationMenuSteps(currentContext);
    }

    public CartModalSteps CartModal() {
        return new CartModalSteps(currentContext);
    }

    public CheckoutPageSteps CheckoutPage() { return new CheckoutPageSteps(currentContext); }

}
