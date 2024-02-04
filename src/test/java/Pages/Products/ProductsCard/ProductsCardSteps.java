package Pages.Products.ProductsCard;

import Framework.TestContext.TestContext;

public class ProductsCardSteps extends ProductCardElements {
    public ProductsCardSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void AddProductToCartByNameSizeAndColour(String productName, String productColour, String productSize) {
        getProductSizeOption(productName, productSize).click();
        getProductColourOption(productName, productColour).click();
        getProductCardByName(productName).hoverElement();
        getProductAddToCart(productName).click();
    }

    public void OpenProductDetailsPage(String productName) {
        getProductCardByName(productName).click();
    }
}
