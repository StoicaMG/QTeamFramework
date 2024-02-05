package Framework.Elements;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseElement {
    private Select dropDown;

    public DropDown(By locator, WebDriver driver) {
        super(locator, driver);
    }

    public Boolean loadDropdown() {
        if (dropDown == null && waitElementToBeVisibleInDOM(DEFAULT_TIMEOUT)) {
            if (loadElement(3, DEFAULT_TIMEOUT)) {
                try {
                    dropDown = new Select(element);
                } catch (Exception e) {
                    Assertions.fail("Could not select the element " + locator + " \n. Check the following logs: \n" + e);
                    return false;
                }
            }
        }
        return true;
    }

    public void selectByText(String text) {
        if (loadDropdown()) {
            try {
                dropDown.selectByVisibleText(text);
            } catch (Exception e) {
                Assertions.fail("Could not select the element " + locator + " \n. Check the following logs: \n" + e);
            }
        }
    }
}
