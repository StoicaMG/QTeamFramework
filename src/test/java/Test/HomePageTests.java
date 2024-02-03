package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import Pages.HomePage.HomePageActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTests {
    TestContext currentContext;
    Application app;
    @BeforeEach
    void Setup(){
        currentContext = new TestContext();
        app = new Application(currentContext);
    }
    @AfterEach
    void TearDown(){
        currentContext.EndTest();
    }

    @Test
    @DisplayName("Open Homepage")
    void homePageTest() {
        app.HomePage().UserIsOnHomePage();
        app.ProductPage().UserIsOnProductsPage();
    }
}
