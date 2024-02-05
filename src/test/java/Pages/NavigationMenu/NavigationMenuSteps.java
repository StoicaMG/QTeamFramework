package Pages.NavigationMenu;

import Framework.TestContext.TestContext;

public class NavigationMenuSteps extends NavigationMenuElements {
    public NavigationMenuSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void clickWhatIsNewButton() {
        getWhatsNewButton().click();
    }

    public NavigationMenuSteps clickNavigationDropDown(String menuOption) {
        getNavigationMenuOption(menuOption).click();
        return this;
    }

    public NavigationMenuSteps hoverNavigationDropDown(String menuOption) {
        getNavigationMenuOption(menuOption).hoverElement();
        return this;
    }

    public NavigationMenuSteps openCartModal() {
        getCartButton().click();
        getCartModal().waitElementToBeDisplayed(15);
        return this;
    }

    public void waitForCartToUpdate(String number) {
        getCartCounterNumber(number).waitElementToBeDisplayed(15);
    }
}
