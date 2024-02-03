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
    @DisplayName("Open Product Page 1")
    void productPage1Test() {
        app.ProductPage().UserIsOnProductsPage();
        app.HomePage().ClickOnWhatIsNewButton();
    }

    @Test
    @DisplayName("Open Product Page 2")
    void productPage2Test() {
        app.ProductPage().UserIsOnProductsPage();
        app.HomePage().ClickOnWhatIsNewButton();
    }

    @Test
    @DisplayName("Open Product Page 3")
    void productPage3Test() {
        app.ProductPage().UserIsOnProductsPage();
        app.HomePage().ClickOnWhatIsNewButton();
    }
}
