package Pages.Notifications;

import Framework.Elements.BaseElement;
import Framework.TestContext.TestContext;
import org.openqa.selenium.By;

public class NotificationsElements {
    TestContext currentContext;

    protected BaseElement getSuccessNotification(String message) {
        return new BaseElement(By.xpath("//div[@data-ui-id='message-success']/div[contains(text(),'" + message + "')]"), currentContext.driver);
    }
}
