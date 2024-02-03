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
    @DisplayName("Open Homepage 1")
    void homePage1Test() {
        app.HomePage().UserIsOnHomePage();
        app.HomePage().ClickOnWhatIsNewButton();
    }

    @Test
    @DisplayName("Open Homepage 2")
    void homePage2Test() {
        app.HomePage().UserIsOnHomePage();
        app.HomePage().ClickOnWhatIsNewButton();
    }

    @Test
    @DisplayName("Open Homepage 3")
    void homePage3Test() {
        app.HomePage().UserIsOnHomePage();
        app.HomePage().ClickOnWhatIsNewButton();
    }
}
