package TestNG_intro;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe_homeWork extends TestBase {

    @Test
    public void test1(){
        driver.navigate().to("http://the-internet.herokuapp.com/iframe");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));

        driver.switchTo().frame(iframe);


        WebElement messageBox = driver.findElement(By.id("tinymce"));
        messageBox.sendKeys(Keys.ENTER);
        messageBox.sendKeys(Keys.BACK_SPACE);
        messageBox.sendKeys("this is how we do it ");

        JavascriptExecutor js = (JavascriptExecutor)driver;






    }

}
