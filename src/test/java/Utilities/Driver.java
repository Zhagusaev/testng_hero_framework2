package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
//import jdk.internal.org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Driver {
    private final static Logger LOG = LoggerFactory.getLogger(Driver.class);
    static WebDriver driver;


    public static WebDriver getDriver(String browser) {

        if (driver == null) {

            switch (browser.toLowerCase()) {
                case "chrome":
                    LOG.info("Log for setting up Chrome ");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    LOG.info("Log Info for setting up FireFox");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    LOG.info("Log Info for setting up Opera");
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                case "ie":
                    LOG.info("Log Info for setting up IO");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    LOG.info("Log Info for setting up Chrome");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        }
        return driver;

    }


}
