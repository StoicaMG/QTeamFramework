package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.*;

public class ProductsPageTests {
    TestContext currentContext;
    Application app;

    @BeforeEach
    void setup(TestInfo testInfo) {
        currentContext = new TestContext(testInfo);
        app = new Application(currentContext);
    }

    @AfterEach
    void tearDown() {
        currentContext.endTest();
    }

    @Test
    @DisplayName("Add product from Products Details page and validate Cart Modal")
    void productsDetailsPageTest() {
        app.HomePage()
                .UserIsOnHomePage()
                .ProductCard().openProductDetailsPage("Radiant Tee");

        app.ProductDetailsPage()
                .selectSizeColourAndQuantity("XL", "Purple", "1")
                .addProductToCart();

        app.Notification()
                .validateSuccessNotificationMessageIsDisplayed("You added Radiant Tee");

        app.HeaderNavigation().openCartModal();

        app.CartModal()
                .ValidateCartModalIsDisplayed()
                .ValidateNumberOfItemsInCart(1)
                .ValidateCartModalSubtotal("$22.00")
                .ValidateProductIsDisplayedInCartModal("Radiant Tee")
                .ProceedToCheckout();
    }
}
