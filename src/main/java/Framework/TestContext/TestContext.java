package Framework.TestContext;

import Framework.Selenium.BrowserFactory;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TestContext {
    public WebDriver driver;
    public TestInfo testInfo;

    public TestContext(TestInfo testInfo) {
        driver = new BrowserFactory().StartBrowser();
        this.testInfo = testInfo;
        System.out.println(driver);
    }

    public void EndTest() {
        System.out.println(driver);
        takeScreenshot();
        BrowserFactory.QuitBrowser(this.driver);

    }

    public void takeScreenshot() {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("src/test/resources/screenshots/" + testInfo.getDisplayName() + ".jpg");
        try {
            FileUtils.copyFile(screenshotFile, DestFile);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
