package Pages.NavigationMenu;

import Framework.TestContext.TestContext;

public class NavigationMenuSteps extends NavigationMenuElements {
    public NavigationMenuSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void ClickWhatIsNewButton() {
        getWhatsNewButton().click();
    }

    public NavigationMenuSteps ClickNavigationDropDown(String menuOption) {
        getNavigationMenuOption(menuOption).click();
        return this;
    }

    public NavigationMenuSteps HoverNavigationDropDown(String menuOption){
        getNavigationMenuOption(menuOption).hoverElement();
        return this;
    }
}
