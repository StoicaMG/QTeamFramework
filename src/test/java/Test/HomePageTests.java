package Test;

import Framework.TestContext.TestContext;
import Steps.HomePageSteps.HomePageActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTests {
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
    @DisplayName("Open Homepage")
    void homePageTest() {
        HomePageActions.UserIsOnHomePage(currentContext);
    }
}
