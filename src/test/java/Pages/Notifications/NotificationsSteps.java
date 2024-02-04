package Pages.Notifications;

import Framework.TestContext.TestContext;
import org.junit.jupiter.api.Assertions;

public class NotificationsSteps extends NotificationsElements {
    public NotificationsSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void ValidateSuccessNotificationMessageIsDisplayed(String message) {
        Assertions.assertTrue(getSuccessNotification().isDisplayed(), "Success notification is not displayed");
        Assertions.assertTrue(getSuccessNotification().innerText().contains(message), "Expected success notification [" + message + "] is not displayed, but actual notification is [" + getSuccessNotification().innerText() + "]");
    }
}
