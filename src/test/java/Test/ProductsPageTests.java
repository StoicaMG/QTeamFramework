package Test;


import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductsPageTests {
    TestContext currentContext;
    Application app;

    @BeforeEach
    void Setup() {
        currentContext = new TestContext();
        app = new Application(currentContext);
    }

    @AfterEach
    void TearDown() {
        currentContext.EndTest();
    }

    @Test
    @DisplayName("Open Product Page")
    void productPageTest() {
        app.ProductPage().UserIsOnProductsPage();
        app.HomePage().UserIsOnHomePage();
    }
}
