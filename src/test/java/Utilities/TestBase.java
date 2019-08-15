package Utilities;

import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    static public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public static void setUp(){

        driver= Driver.getDriver("firefox");


    }


    @AfterClass
    public static void tearDown(){

      //  driver.quit();
    }
}
