package Framework.Selenium;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public WebDriver driver = null;
    public String browser = System.getProperty("BROWSER").toLowerCase();

    public BrowserFactory() {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            case "edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            default:
                Assertions.fail("Used browser [" + browser + "] is not recognized");
        }
    }

    public static void QuitBrowser(WebDriver driver) {
        driver.quit();
    }
}
