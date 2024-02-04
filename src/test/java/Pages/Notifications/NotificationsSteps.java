package Pages.Notifications;

import Framework.TestContext.TestContext;
import org.junit.jupiter.api.Assertions;

public class NotificationsSteps extends NotificationsElements {
    public NotificationsSteps(TestContext currentContext) {
        this.currentContext = currentContext;
    }

    public void ValidateSuccessNotificationMessageIsDisplayed(String message) {
        Assertions.assertTrue(getSuccessNotification(message).isDisplayed(), "Success notification with message [" + message + "] is not displayed");
    }
}
