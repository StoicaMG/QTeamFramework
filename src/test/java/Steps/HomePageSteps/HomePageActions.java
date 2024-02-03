package Steps.HomePageSteps;

import Framework.TestContext.TestContext;
import Steps.BrowserSteps.BrowserActions;

public class HomePageActions {
    public static void UserIsOnHomePage(TestContext currentContext){
        BrowserActions browser = new BrowserActions(currentContext);
        browser.OpenPage("https://magento.softwaretestingboard.com/");
    }

}
