package Pages.Products.ProductsCard;

import Framework.Elements.BaseElement;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class ProductCardElements {
    TestContext currentContext;

    private final String productCard = "//div[@class='product-item-info']";

    protected BaseElement getProductCardByName(String productName) {
        return new BaseElement(By.xpath(productCard + "[div/strong/a[contains(text(),'" + productName + "')]]"), currentContext.driver);
    }

    protected BaseElement getProductSizeOption(String productName, String size) {
        return new BaseElement(By.xpath(productCard + "[div/strong/a[contains(text(),'" + productName + "')]]//div[@option-label='" + size + "']"), currentContext.driver);
    }

    protected BaseElement getProductColourOption(String productName, String colour) {
        return new BaseElement(By.xpath(productCard + "[div/strong/a[contains(text(),'" + productName + "')]]//div[@option-label='" + colour + "']"), currentContext.driver);
    }

    protected BaseElement getProductAddToCart(String productName) {
        return new BaseElement(By.xpath(productCard + "[div/strong/a[contains(text(),'" + productName + "')]]//button[@type='submit']"), currentContext.driver);
    }
}
