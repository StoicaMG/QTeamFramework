package Pages.HomePage;

import Framework.TestContext.TestContext;

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