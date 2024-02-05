package Pages.CartModal;

import Framework.Elements.BaseElement;
import Framework.Elements.TextField;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class CartModalElements {
    TestContext currentContext;

    protected BaseElement getCartModal() {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']"), currentContext.driver);
    }

    protected BaseElement getTotalItemsInCart() {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//div[@class='items-total']"), currentContext.driver);
    }

    protected BaseElement getSubtotal() {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//div[@class='amount price-container']"), currentContext.driver);
    }

    protected BaseElement getProceedToCheckoutButton() {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//button[@id='top-cart-btn-checkout']"), currentContext.driver);
    }

    protected BaseElement getProductFromCartByName(String productName) {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//div[@class='product-item-details'][//a[text()='" + productName + "']]"), currentContext.driver);
    }

    protected TextField getProductQuantityTextField(String productName) {
        return new TextField(By.xpath("//div[@data-role='dropdownDialog']//div[@class='product-item-details'][//a[text()='" + productName + "']]//div[@class='details-qty qty']/input"), currentContext.driver);
    }

    protected BaseElement getProductEditButton(String productName) {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//div[@class='product-item-details'][//a[text()='" + productName + "']]//div[@class='primary']"), currentContext.driver);
    }

    protected BaseElement getProductRemoveButton(String productName) {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//div[@class='product-item-details'][//a[text()='" + productName + "']]//div[@class='secondary']"), currentContext.driver);
    }

    protected BaseElement getViewAndEditCartButton() {
        return new BaseElement(By.xpath("//div[@data-role='dropdownDialog']//a[@class='action viewcart']"), currentContext.driver);
    }
}
