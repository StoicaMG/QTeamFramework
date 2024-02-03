package Pages.HomePage;

import Framework.TestContext.TestContext;
import Framework.Browser.BrowserActions;

public class HomePageActions {
    BrowserActions browser;

    public HomePageActions(TestContext currentContext) {
        browser = new BrowserActions(currentContext);
    }

    public void UserIsOnHomePage(){
        browser.OpenPage("https://magento.softwaretestingboard.com/");
    }

}
