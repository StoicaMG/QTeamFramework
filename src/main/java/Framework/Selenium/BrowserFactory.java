package Framework.Selenium;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public String browser = System.getProperty("BROWSER").toLowerCase();

    public WebDriver startBrowser() {
        WebDriver driver;
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                return driver;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;
            case "edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                return driver;
            default:
                Assertions.fail("Used browser [" + browser + "] is not recognized");
        }
        return null;
    }

    public static void quitBrowser(WebDriver driver) {
        driver.quit();
    }

    public static void openPage(WebDriver driver, String url) {
        driver.get(url);
    }
}
