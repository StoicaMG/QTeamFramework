package Pages.CheckoutPage;

import Framework.TestContext.TestContext;
import org.junit.jupiter.api.Assertions;

public class CheckoutPageSteps extends CheckoutPageElements {
    public CheckoutPageSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public CheckoutPageSteps typeEmailAddress(String emailAddress) {
        getEmailAddressTextField().waitElementToBeDisplayed(15);
        getEmailAddressTextField().clearField();
        getEmailAddressTextField().sendKeys(emailAddress);
        return this;
    }

    public CheckoutPageSteps typeFirstName(String firstName) {
        getFirstNameTextField().waitElementToBeDisplayed(15);
        getFirstNameTextField().clearField();
        getFirstNameTextField().sendKeys(firstName);
        return this;
    }

    public CheckoutPageSteps typeLastName(String lastName) {
        getLastNameTextField().waitElementToBeDisplayed(15);
        getLastNameTextField().clearField();
        getLastNameTextField().sendKeys(lastName);
        return this;
    }

    public CheckoutPageSteps typeCompany(String company) {
        getCompanyTextField().waitElementToBeDisplayed(15);
        getCompanyTextField().clearField();
        getCompanyTextField().sendKeys(company);
        return this;
    }

    public CheckoutPageSteps typeStreetAddress(String streetAddress, String row) {
        getStreetAddressTextField(row).waitElementToBeDisplayed(15);
        getStreetAddressTextField(row).clearField();
        getStreetAddressTextField(row).sendKeys(streetAddress);
        return this;
    }

    public CheckoutPageSteps typeCity(String city) {
        getCityTextField().waitElementToBeDisplayed(15);
        getCityTextField().clearField();
        getCityTextField().sendKeys(city);
        return this;
    }

    public CheckoutPageSteps selectStateProvince(String option) {
        getStateProvinceDropDown().waitElementToBeDisplayed(15);
        getStateProvinceDropDown().click();
        getStateProvinceDropDown().selectByText(option);
        getStateProvinceDropDown().click();
        return this;
    }

    public CheckoutPageSteps typeZipPostalCode(String zipPostalCode) {
        getZipPostalCodeTextField().waitElementToBeDisplayed(15);
        getZipPostalCodeTextField().clearField();
        getZipPostalCodeTextField().sendKeys(zipPostalCode);
        return this;
    }

    public CheckoutPageSteps selectCountry(String option) {
        getCountryDropDown().waitElementToBeDisplayed(15);
        getCountryDropDown().click();
        getCountryDropDown().selectByText(option);
        getCountryDropDown().click();
        return this;
    }

    public CheckoutPageSteps typePhoneNumber(String phoneNumber) {
        getPhoneNumberTextField().waitElementToBeDisplayed(15);
        getPhoneNumberTextField().clearField();
        getPhoneNumberTextField().sendKeys(phoneNumber);
        return this;
    }

    public CheckoutPageSteps selectShippingMethodByPrice(String price) {
        getShippingMethodByPrice(price).click();
        return this;
    }

    public CheckoutPageSteps clickNextButton() {
        getNextButton().waitElementToBeClickable(15);
        getNextButton().click();
        return this;
    }

    public CheckoutPageSteps completeCheckoutMandatoryFields(String emailAddress, String firstName, String lastName, String streetAddress, String city, String stateProvince, String zipCode, String country, String phoneNumber, String price) {
        typeEmailAddress(emailAddress);
        typeFirstName(firstName);
        typeLastName(lastName);
        typeStreetAddress(streetAddress, "0");
        typeCity(city);
        selectCountry(country);
        selectStateProvince(stateProvince);
        typeZipPostalCode(zipCode);
        typePhoneNumber(phoneNumber);
        selectShippingMethodByPrice(price);
        clickNextButton();
        return this;
    }

    public void validateOrderSummaryContainsCorrectProduct(String numberOfItems, String itemName, String itemQuantity, String itemPrice, String itemSize, String itemColour) {
        OrderSummary orderSummary = new OrderSummary();
        Assertions.assertEquals(orderSummary.getNumberOfItemsInCart().innerText(), numberOfItems + " Item in Cart");

        orderSummary.getNumberOfItemsInCart().waitElementToBeDisplayed(15);
        orderSummary.getNumberOfItemsInCart().click();
        orderSummary.getItemByName(itemName).waitElementToBeDisplayed(15);
        Assertions.assertEquals(orderSummary.getItemQuantityByName(itemName).innerText(), itemQuantity);
        Assertions.assertEquals(orderSummary.getItemPriceByName(itemName).innerText(), itemPrice);

        orderSummary.getItemDetailsExpandableByName(itemName).click();
        Assertions.assertEquals(orderSummary.getItemSizeByName(itemName).innerText(), itemSize);
        Assertions.assertEquals(orderSummary.getItemColourByName(itemName).innerText(), itemColour);
    }

    public CheckoutPageSteps placeOrder() {
        getPlaceOrderButton().click();
        getPlaceOrderButton().waitElementToDisappear(15);
        return this;
    }

    public void validateOrderWasPlacedSuccessfully(String message) {
        getOrderConfirmationMessage().waitElementToBeDisplayed(15);
        Assertions.assertEquals(getOrderConfirmationMessage().innerText(), message);
    }
}
