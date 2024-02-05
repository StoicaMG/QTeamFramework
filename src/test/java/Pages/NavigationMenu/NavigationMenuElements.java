package Pages.NavigationMenu;

import Framework.Elements.BaseElement;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class NavigationMenuElements {
    TestContext currentContext;

    protected BaseElement getWhatsNewButton() {
        return new BaseElement(By.xpath("//div[@id='store.menu']//a[@id='ui-id-3']"), currentContext.driver);
    }

    protected BaseElement getNavigationMenuOption(String option) {
        return new BaseElement(By.xpath("//nav[@class='navigation']/ul/li[a/span[text()=\"" + option + "\"]]"), currentContext.driver);
    }

    protected BaseElement getCartButton() {
        return new BaseElement(By.xpath("//div[@data-block='minicart']"), currentContext.driver);
    }

    protected BaseElement getCartModal() {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']"), currentContext.driver);
    }

    protected BaseElement getCartCounterNumber(String counterNumber) {
        return new BaseElement(By.xpath("//span[@class='counter qty']/span[@class='counter-number'][text()='" + counterNumber + "']"), currentContext.driver);
    }
}
