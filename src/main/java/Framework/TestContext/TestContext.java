package Framework.TestContext;

import Framework.Selenium.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public WebDriver driver;

    public TestContext() {
        driver = new BrowserFactory().StartBrowser();
        System.out.println(driver);
    }

    public void EndTest() {
        System.out.println(driver);
        BrowserFactory.QuitBrowser(this.driver);
    }
}
