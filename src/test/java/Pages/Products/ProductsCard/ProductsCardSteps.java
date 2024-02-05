package Pages.Products.ProductsCard;

import Framework.TestContext.TestContext;

public class ProductsCardSteps extends ProductCardElements {
    public ProductsCardSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public ProductsCardSteps addProductToCartByNameSizeAndColour(String productName, String productColour, String productSize) {
        getProductSizeOption(productName, productSize).click();
        getProductColourOption(productName, productColour).click();
        getProductCardByName(productName).hoverElement();
        getProductAddToCart(productName).click();
        return this;
    }

    public void openProductDetailsPage(String productName) {
        getProductCardByName(productName).click();
    }
}
