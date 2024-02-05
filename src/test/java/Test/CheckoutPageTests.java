package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.*;

public class CheckoutPageTests {
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
    @DisplayName("Add products and validate checkout page")
    void checkoutPageTest() {
        app.HomePage()
                .UserIsOnHomePage()
                .ProductCard().addProductToCartByNameSizeAndColour("Radiant Tee", "M", "Purple");

        app.HeaderNavigation()
                .waitForCartToUpdate("1");

        app.Notification()
                .validateSuccessNotificationMessageIsDisplayed("You added Radiant Tee to your shopping cart.");

        app.HeaderNavigation()
                .openCartModal();

        app.CartModal()
                .ProceedToCheckout();

        app.CheckoutPage()
                .validateOrderSummaryContainsCorrectProduct("1", "Radiant Tee", "Qty 1", "$22.00", "M", "Purple");

        app.CheckoutPage()
                .completeCheckoutMandatoryFields("mircea@gmail.com", "Mircea", "Stoica", "Bulevardul Garii", "Braşov", "Braşov", "500227", "Romania", "0748123456", "$5.00")
                .placeOrder()
                .validateOrderWasPlacedSuccessfully("Thank you for your purchase!");
    }
}
