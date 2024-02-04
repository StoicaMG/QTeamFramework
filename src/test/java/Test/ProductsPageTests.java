package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.*;

public class ProductsPageTests {
    TestContext currentContext;
    Application app;

    @BeforeEach
    void Setup(TestInfo testInfo) {
        currentContext = new TestContext(testInfo);
        app = new Application(currentContext);
    }

    @AfterEach
    void TearDown() {
        currentContext.EndTest();
    }

    @Test
    @DisplayName("Add product from Products Details page and validate checkout")
    void homePageTest() {
        app.HomePage()
                .UserIsOnHomePage()
                .ProductCard().OpenProductDetailsPage("Radiant Tee");

        app.ProductDetailsPage()
                .SelectSizeColourAndQuantity("XL", "Purple", "2")
                .AddProductToCart();

        app.Notification()
                .ValidateSuccessNotificationMessageIsDisplayed("You added Radiant Tee");
    }
}
