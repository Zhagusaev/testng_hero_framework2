package TestNG_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Paralel_Testing {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

//(groups = {"contact"})
    @Test
    public void test1() {
        driver.get("http://automationpractice.com/index.php?controller=contact");

//        String actual = driver.findElement(By.xpath("//label[@for='id_contact']")).getText();
//        String expected = "Subject Title";
//        SoftAssert soft = new SoftAssert();
//        soft.assertEquals(actual, expected);

        WebElement subjectHeading = driver.findElement(By.id("id_contact"));
        Select select = new Select(subjectHeading);
        select.selectByIndex(1);

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("kanybek191090@mail.ru");

        WebElement orderReffernce = driver.findElement(By.name("id_order"));
        orderReffernce.sendKeys("1234566778");

        WebElement attachFile = driver.findElement(By.id("fileUpload"));
//        attachFile.click();
        attachFile.sendKeys("/Users/kanybek/Desktop/Shot.png");

        WebElement messageBox = driver.findElement(By.id("message"));
        messageBox.sendKeys("   ");

        WebElement sendButton = driver.findElement(By.id("submitMessage"));
        sendButton.click();

        String expected = "Your message has been successfully sent to our tea.";
        SoftAssert soft = new SoftAssert();

        String actual = driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
        soft.assertEquals(expected,actual);


        soft.assertAll();
    }
}
