package Pages.CartModal;

import Framework.TestContext.TestContext;
import org.junit.jupiter.api.Assertions;

public class CartModalSteps extends CartModalElements {
    public CartModalSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public CartModalSteps ValidateCartModalIsDisplayed() {
        Assertions.assertTrue(getCartModal().isDisplayed(), "Cart modal was not displayed");
        return this;
    }

    public CartModalSteps ValidateNumberOfItemsInCart(Integer expectedNumberOfItems) {
        getTotalItemsInCart().waitElementToBeDisplayed(15);
        if (expectedNumberOfItems == 1)
            Assertions.assertEquals(getTotalItemsInCart().innerText(), expectedNumberOfItems + " Item in Cart", "Number of items in cart modal was not displayed");
        else
            Assertions.assertEquals(getTotalItemsInCart().innerText(), expectedNumberOfItems + " Items in Cart", "Number of items in cart modal was not displayed");
        return this;
    }

    public CartModalSteps ValidateCartModalSubtotal(String expectedSubtotal) {
        Assertions.assertTrue(getSubtotal().isDisplayed(), "Subtotal was not displayed");
        Assertions.assertEquals(getSubtotal().innerText(), expectedSubtotal, "Subtotal was not displayed");
        return this;
    }

    public CartModalSteps ValidateProductIsDisplayedInCartModal(String expectedProduct) {
        Assertions.assertTrue(getProductFromCartByName(expectedProduct).isDisplayed(), "Expected product [" + expectedProduct + "] was not displayed");
        return this;
    }

    public CartModalSteps ProceedToCheckout() {
        getProceedToCheckoutButton().waitElementToBeClickable(15);
        getProceedToCheckoutButton().click();
        return this;
    }

}
