package Pages.HomePage;

import Framework.Elements.BaseElement;
import Framework.TestContext.TestContext;
import Framework.Browser.BrowserActions;
import org.openqa.selenium.By;

public class HomePageActions extends HomePageElements {

    public HomePageActions(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void UserIsOnHomePage() {
        currentContext.driver.get("https://magento.softwaretestingboard.com/");
    }

    public void ClickOnWhatIsNewButton(){
        getWhatsNewButton().click();
    }

}