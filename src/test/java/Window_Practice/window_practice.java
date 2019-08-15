package Window_Practice;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class window_practice extends TestBase {




    @Test
    public static void test1(){

        driver.navigate().to("https://www.messenger.com/");
        WebElement googlePlay=driver.findElement(By.xpath("//i[@class='img sp_RpQ8QNMBode sx_9ca3e7']"));


        String homePage=driver.getWindowHandle();

        System.out.println(homePage);

        googlePlay.click();

        Set<String> allPages=driver.getWindowHandles();

        for(String window:allPages){

            if(!window.equals(homePage)){

                driver.switchTo().window(window);
            }

        }


        WebElement installButton=driver.findElement(By.xpath("//button[@aria-label='Install']"));

        installButton.click();

        //Selenium can handle only one tab/windows at a time.

        //To be able to click the installButton on googlePlay page we need switch the window.

        // Every window/tab has own uniqe id.

        //GetWindowHanlde will return String of Id for our current page.



    }


}
