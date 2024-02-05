package Pages.CheckoutPage;

import Framework.Elements.BaseElement;
import Framework.Elements.Checkbox;
import Framework.Elements.DropDown;
import Framework.Elements.TextField;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class CheckoutPageElements {
    TestContext currentContext;

    protected TextField getEmailAddressTextField() {
        return new TextField(By.xpath("//fieldset[@id='customer-email-fieldset']//input[@id='customer-email']"), currentContext.driver);
    }

    protected TextField getFirstNameTextField() {
        return new TextField(By.xpath("//div[@name='shippingAddress.firstname']//input"), currentContext.driver);
    }

    protected TextField getLastNameTextField() {
        return new TextField(By.xpath("//div[@name='shippingAddress.lastname']//input"), currentContext.driver);
    }

    protected TextField getCompanyTextField() {
        return new TextField(By.xpath("//div[@name='shippingAddress.company']//input"), currentContext.driver);
    }

    protected TextField getStreetAddressTextField(String rowNumber) {
        return new TextField(By.xpath("//div[@name='shippingAddress.street." + rowNumber + "']//input"), currentContext.driver);
    }

    protected TextField getCityTextField() {
        return new TextField(By.xpath("//div[@name='shippingAddress.city']//input"), currentContext.driver);
    }

    protected DropDown getStateProvinceDropDown() {
        return new DropDown(By.xpath("//div[@name='shippingAddress.region_id']//select"), currentContext.driver);
    }

    protected TextField getZipPostalCodeTextField() {
        return new TextField(By.xpath("//div[@name='shippingAddress.postcode']//input"), currentContext.driver);
    }

    protected DropDown getCountryDropDown() {
        return new DropDown(By.xpath("//div[@name='shippingAddress.country_id']//select"), currentContext.driver);
    }

    protected TextField getPhoneNumberTextField() {
        return new TextField(By.xpath("//div[@name='shippingAddress.telephone']//input"), currentContext.driver);
    }

    protected Checkbox getShippingMethodByPrice(String price) {
        return new Checkbox(By.xpath("//tr[td//span[@class='price' and text()='" + price + "']]//input"), currentContext.driver);
    }

    protected BaseElement getNextButton() {
        return new BaseElement(By.xpath("//button[contains(@class, 'continue')]"), currentContext.driver);
    }

    protected BaseElement getPlaceOrderButton() {
        return new BaseElement(By.xpath("//button[contains(@class, 'checkout')]"), currentContext.driver);
    }

    protected BaseElement getOrderConfirmationMessage() {
        return new BaseElement(By.xpath("//span[@data-ui-id='page-title-wrapper']"), currentContext.driver);
    }

    protected class OrderSummary {
        private final String orderSummaryModal = "//div[@class='opc-block-summary']";

        protected BaseElement getNumberOfItemsInCart() {
            return new BaseElement(By.xpath(orderSummaryModal + "//strong[@role='heading']"), currentContext.driver);
        }

        protected BaseElement getItemByName(String name) {
            return new BaseElement(By.xpath(orderSummaryModal + "//li[@class='product-item'][//strong[text()='" + name + "']]"), currentContext.driver);
        }

        protected BaseElement getItemQuantityByName(String name) {
            return new BaseElement(By.xpath(orderSummaryModal + "//li[@class='product-item'][//strong[text()='" + name + "']]//div[@class='details-qty']"), currentContext.driver);
        }

        protected BaseElement getItemPriceByName(String name) {
            return new BaseElement(By.xpath(orderSummaryModal + "//li[@class='product-item'][//strong[text()='" + name + "']]//span[@class='cart-price']"), currentContext.driver);
        }

        protected BaseElement getItemDetailsExpandableByName(String name) {
            return new BaseElement(By.xpath(orderSummaryModal + "//li[@class='product-item'][//strong[text()='" + name + "']]//div[contains(@class,'options')]"), currentContext.driver);
        }

        protected BaseElement getItemSizeByName(String name) {
            return new BaseElement(By.xpath(orderSummaryModal + "//li[@class='product-item'][//strong[text()='" + name + "']]//dl[@class='item-options']/dd[1]"), currentContext.driver);
        }

        protected BaseElement getItemColourByName(String name) {
            return new BaseElement(By.xpath(orderSummaryModal + "//li[@class='product-item'][//strong[text()='" + name + "']]//dl[@class='item-options']/dd[2]"), currentContext.driver);
        }
    }
}
