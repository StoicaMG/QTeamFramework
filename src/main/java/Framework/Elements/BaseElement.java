package Framework.Elements;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseElement {
    private WebDriver driver;
    protected WebElement element;
    protected By locator;
    public final static int DEFAULT_TIMEOUT = 15;

    public BaseElement(By locator, WebDriver driver) {
        this.locator = locator;
        this.driver = driver;
    }

    public boolean scrollToElement() {
        if (loadElement(3, 5)) {
            Actions action = new Actions(driver);
            action.moveToElement(this.element);
            action.perform();
        }
        return true;
    }

    public boolean isSelected() throws Exception {
        if (loadElement(3, 5))
            try {
                return this.element.isSelected();
            } catch (Exception e) {
                throw new Exception("Could not return Selected attribute of element [" + this.locator + "] \n Logs: \n " + e);
            }
        throw new Exception("Element was not loaded: [" + this.locator + "]");
    }

    public String innerText() throws Exception {
        if (loadElement(3, 5))
            try {
                return this.element.getText();
            } catch (Exception e) {
                throw new Exception("Could not return Text attribute of element [" + this.locator + "] \n Logs: \n " + e);
            }
        throw new Exception("Element was not loaded: [" + this.locator + "]");
    }

    public void submit() throws Exception {
        if (loadElement(3, 5))
            try {
                this.element.submit();
            } catch (Exception e) {
                throw new Exception("Could not return Submit on element [" + this.locator + "] \n Logs: \n " + e);
            }
        throw new Exception("Element was not loaded: [" + this.locator + "]");
    }

    public void click() {
        if (loadElement(3, 5))
            try {
                scrollToElement();
                this.element.click();
            } catch (ElementClickInterceptedException e) {
                waitElementToBeClickable(DEFAULT_TIMEOUT);
                this.element.click();
            } catch (Exception e) {
                Assertions.fail("Could not Click on element [" + this.locator + "] \n Logs: \n " + e);
            }
    }

    public boolean loadElement(int retryAttempts, int timeout) {
        if (this.element == null && waitElementToBeVisibleInDOM(timeout)) {
            try {
                this.element = driver.findElement(this.locator);
            } catch (StaleElementReferenceException e) {
                this.element = null;
                if (retryAttempts == 1)
                    Assertions.fail("Could not load element: " + e);
                loadElement(retryAttempts - 1, DEFAULT_TIMEOUT);
            } catch (NoSuchElementException e) {
                Assertions.fail("Could not find element by locator: [" + this.locator + "].\n Logs: " + e);
            }
        }
        return true;
    }

    public boolean waitElementToBeVisibleInDOM(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.pollingEvery(Duration.ofMillis(200));
        wait.until(ExpectedConditions.presenceOfElementLocated(this.locator));
        return true;
    }

    public void waitElementToBeDisplayed(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.pollingEvery(Duration.ofMillis(200));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }

    public void waitElementToBeClickable(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.pollingEvery(Duration.ofMillis(200));
        wait.until(ExpectedConditions.elementToBeClickable(this.locator));
    }

}
