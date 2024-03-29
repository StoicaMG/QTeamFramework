package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.*;

public class HomePageTests {
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
    @DisplayName("Add product from Home page and validate cart modal")
    void homePageTest() {
        app.HomePage()
                .UserIsOnHomePage()
                .ProductCard().addProductToCartByNameSizeAndColour("Radiant Tee", "M", "Purple");

        app.HeaderNavigation()
                .waitForCartToUpdate("1");

        app.Notification()
                .validateSuccessNotificationMessageIsDisplayed("You added Radiant Tee to your shopping cart.");

        app.HeaderNavigation().openCartModal();

        app.CartModal()
                .ValidateCartModalIsDisplayed()
                .ValidateNumberOfItemsInCart(1)
                .ValidateCartModalSubtotal("$22.00")
                .ValidateProductIsDisplayedInCartModal("Radiant Tee")
                .ProceedToCheckout();
    }
}
