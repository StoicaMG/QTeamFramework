package Framework.Selenium;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public String browser = System.getProperty("BROWSER").toLowerCase();

    public WebDriver StartBrowser() {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                Assertions.fail("Used browser [" + browser + "] is not recognized");
        }
        return null;
    }

    public static void QuitBrowser(WebDriver driver) {
        driver.quit();
    }
}
