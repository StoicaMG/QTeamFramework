package Pages.Notifications;

import Framework.TestContext.TestContext;
import org.junit.jupiter.api.Assertions;

public class NotificationsSteps extends NotificationsElements {
    public NotificationsSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void validateSuccessNotificationMessageIsDisplayed(String message) {
        getSuccessNotification().waitElementToBeDisplayed(15);
        Assertions.assertTrue(getSuccessNotification().innerText().contains(message), "Expected success notification [" + message + "] is not displayed, but actual notification is [" + getSuccessNotification().innerText() + "]");
    }
}
