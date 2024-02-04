package Pages.Products.ProductsDetailsPage;

import Framework.Elements.BaseElement;
import Framework.Elements.TextField;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class ProductsDetailsElements {
    TestContext currentContext;

    protected BaseElement getSize(String size) {
        return new BaseElement(By.xpath("//div[@attribute-code='size']//div[@option-label='" + size + "']"), currentContext.driver);
    }

    protected BaseElement getColour(String colour) {
        return new BaseElement(By.xpath("//div[@attribute-code='color']//div[@option-label='" + colour + "']"), currentContext.driver);
    }

    protected TextField getQuantity() {
        return new TextField(By.cssSelector("input.qty"), currentContext.driver);
    }

    protected BaseElement getAddProductToCartButton() {
        return new BaseElement(By.cssSelector("button#product-addtocart-button"), currentContext.driver);
    }
}
