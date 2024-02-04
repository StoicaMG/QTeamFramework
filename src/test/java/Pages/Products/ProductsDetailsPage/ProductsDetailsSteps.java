package Pages.Products.ProductsDetailsPage;

import Framework.TestContext.TestContext;

public class ProductsDetailsSteps extends ProductsDetailsElements{
    public ProductsDetailsSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public ProductsDetailsSteps SelectSizeColourAndQuantity(String size, String colour, String quantity){
        getSize(size).click();
        getColour(colour).click();
        getQuantity().clearField();
        getQuantity().sendKeys(quantity);
        return this;
    }

    public ProductsDetailsSteps AddProductToCart(){
        getAddProductToCartButton().click();
        return this;
    }
}
