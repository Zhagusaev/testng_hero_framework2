package TestNG_intro;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class html_popup extends TestBase {


    @Test
    public static void test1() throws InterruptedException {

        driver.navigate().to("https://sweetalert.js.org/");
        driver.findElement(By.xpath("(//button[@class='preview'])[2]")).click();

        WebElement okayButton=driver.findElement(By.xpath("(//div[@class='swal-button-container'])[3]"));

        WebDriverWait wait=new WebDriverWait(driver,3);

        wait.until(ExpectedConditions.elementToBeClickable(okayButton));

        okayButton.click();
    }




}
