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

    public void scrollToElement() {
        if (loadElement(3, 5)) {
            Actions action = new Actions(driver);
            action.moveToElement(this.element);
            action.perform();
        }
    }

    public void hoverElement() {
        if (loadElement(3, 5)) {
            Actions action = new Actions(driver);
            action.moveToElement(this.element);
            action.perform();
        }
    }

    public boolean isDisplayed() {
        if (loadElement(3, 5))
            try {
                return this.element.isDisplayed();
            } catch (Exception e) {
                Assertions.fail("Could not return Displayed attribute of element [" + this.locator + "] \n Logs: \n " + e);
            }
        Assertions.fail("Element was not loaded: [" + this.locator + "]");
        return false;
    }

    public String innerText() {
        if (loadElement(3, 5))
            try {
                return this.element.getText();
            } catch (Exception e) {
                Assertions.fail("Could not return Text attribute of element [" + this.locator + "] \n Logs: \n " + e);
            }
        Assertions.fail("Element was not loaded: [" + this.locator + "]");
        return "Element was not loaded: [" + this.locator + "]";
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

    public Boolean loadElement(int retryAttempts, int timeout) {
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

    public void waitElementToDisappear(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.pollingEvery(Duration.ofMillis(200));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(this.locator));
    }

    public void waitElementToBeClickable(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.pollingEvery(Duration.ofMillis(200));
        wait.until(ExpectedConditions.elementToBeClickable(this.locator));
    }
}
