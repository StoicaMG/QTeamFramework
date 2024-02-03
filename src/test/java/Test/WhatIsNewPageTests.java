package Test;

import Framework.TestContext.TestContext;
import Pages.Application;
import org.junit.jupiter.api.*;

public class WhatIsNewPageTests {
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
    @DisplayName("Open WhatIsNew page 1")
    void whatIsNewPage1Test() {
        app.HomePage().UserIsOnHomePage();
        app.HomePage().ClickOnWhatIsNewButton();
    }

    @Test
    @DisplayName("Open WhatIsNew page 2")
    void whatIsNewPage2Test() {
        app.HomePage().UserIsOnHomePage();
        app.HomePage().ClickOnWhatIsNewButton();
    }

    @Test
    @DisplayName("Open WhatIsNew page 3")
    void whatIsNewPage3Test() {
        app.HomePage().UserIsOnHomePage();
        app.HomePage().ClickOnWhatIsNewButton();
    }
}
