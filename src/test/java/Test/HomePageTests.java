package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.*;

public class HomePageTests {
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
    @DisplayName("Add product from Home page and validate checkout")
    void homePageTest() {
        app.HomePage()
                .UserIsOnHomePage()
                .ProductCard().AddProductToCartByNameSizeAndColour("Radiant Tee", "M", "Purple");

        app.Notification()
                .ValidateSuccessNotificationMessageIsDisplayed("You added Radiant Tee");

        app.HomePage()
                .ProductCard().OpenProductDetailsPage("Radiant Tee");
    }
}
