package Pages.Cart.CartDetailsPage;

import Framework.Elements.BaseElement;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class CartDetailsPageElements {
    TestContext currentContext;

    protected BaseElement getRemoveItemButton() {
        return new BaseElement(By.xpath(""), currentContext.driver);
    }
}
