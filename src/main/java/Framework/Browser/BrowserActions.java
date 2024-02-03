package Framework.Browser;

import Framework.TestContext.TestContext;
import org.openqa.selenium.WebDriver;

public class BrowserActions {

    public static void OpenPage(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void RefreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void GetPageTitle(WebDriver driver) {
        driver.getTitle();
    }

    public static void MaximizePage(WebDriver driver) { driver.manage().window().maximize(); }
}
