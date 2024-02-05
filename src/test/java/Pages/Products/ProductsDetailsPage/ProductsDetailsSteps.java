package Pages.Products.ProductsDetailsPage;

import Framework.TestContext.TestContext;

public class ProductsDetailsSteps extends ProductsDetailsElements{
    public ProductsDetailsSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public ProductsDetailsSteps selectSizeColourAndQuantity(String size, String colour, String quantity){
        getSize(size).waitElementToBeClickable(15);
        getSize(size).click();
        getColour(colour).waitElementToBeClickable(15);
        getColour(colour).click();
        getQuantity().waitElementToBeClickable(15);
        getQuantity().clearField();
        getQuantity().sendKeys(quantity);
        return this;
    }

    public ProductsDetailsSteps addProductToCart(){
        getAddProductToCartButton().waitElementToBeClickable(15);
        getAddProductToCartButton().click();
        return this;
    }
}
