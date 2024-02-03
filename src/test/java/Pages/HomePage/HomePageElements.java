package Pages.HomePage;

import Framework.Elements.BaseElement;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class HomePageElements {
    TestContext currentContext;

    public BaseElement getWhatsNewButton() {
        return new BaseElement(By.xpath("//div[@id='store.menu']//a[@id='ui-id-3']"), currentContext.driver);
    }
}
