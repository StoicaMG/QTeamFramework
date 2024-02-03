package Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextField extends BaseElement {
    public TextField(By locator, WebDriver driver) {
        super(locator, driver);
    }

    public void sendKeys(String text) throws Exception {
        if (loadElement(3, DEFAULT_TIMEOUT)) {
            try {
                this.element.sendKeys(text);
            } catch (Exception e) {
                throw new Exception("Could not write into text field [" + this.locator + "] \n Logs: " + e);
            }
        }
    }

    public void clearField() throws Exception {
        if (loadElement(3, DEFAULT_TIMEOUT)) {
            try {
                this.element.clear();
            } catch (Exception e) {
                throw new Exception("Could not clear text field [" + this.locator + "] \n Logs: " + e);
            }
        }
    }
}
