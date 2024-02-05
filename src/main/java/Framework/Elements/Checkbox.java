package Framework.Elements;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox extends BaseElement {

    public Checkbox(By locator, WebDriver driver) {
        super(locator, driver);
    }

    public Boolean isChecked(Integer timeout) {
        if (loadElement(3, DEFAULT_TIMEOUT)) {
            return element.isSelected();
        }
        Assertions.fail("Element " + locator + " was not displayed properly.");
        return false;
    }
}
