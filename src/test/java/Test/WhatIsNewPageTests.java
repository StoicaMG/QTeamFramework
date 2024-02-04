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
}
