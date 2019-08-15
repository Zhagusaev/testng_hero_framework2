package Window_Practice;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class window_rocketLawyer extends TestBase {


    @Test
    public static void test1(){

        driver.navigate().to("https://www.rocketlawyer.com/");

        WebElement helpButton=driver.findElement(By.xpath("//div[@class='svg-svgs--icon-help-white-dims svg-svgs--icon-help-white']"));

        Actions action=new Actions(driver);

        action.moveToElement(helpButton).perform();

        WebElement chatOnline=driver.findElement(By.xpath("(//a[@id='navbar_chat_link_logged_out'])[1]"));

        chatOnline.click();

        System.out.println(driver.getTitle());


        String homePage=driver.getWindowHandle();

        System.out.println(homePage);

        Set<String> windows=driver.getWindowHandles();

        String expectedTitle="https://www.rocketlawyer.com/nanorep.rl";

        for (String window:windows) {

            if(!window.equals(homePage)) {
                driver.switchTo().window(window);

            }
        }


        System.out.println(driver.getWindowHandle());

        driver.switchTo().defaultContent();

        System.out.println(driver.getWindowHandle());


    }


}
