package Test;


import Framework.TestContext.TestContext;
import Steps.ProductsPageSteps.ProductsPageActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductsPageTests {
    TestContext currentContext;
    @BeforeEach
    void Setup(){
        currentContext = new TestContext();
        currentContext.StartTest();
    }
    @AfterEach
    void TearDown(){
        currentContext.EndTest();
    }
    @Test
    @DisplayName("Open Product Page")
    void productPageTest() {
        ProductsPageActions.UserIsOnProductsPage(currentContext);
    }
}
