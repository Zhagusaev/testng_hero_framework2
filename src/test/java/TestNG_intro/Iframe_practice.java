package TestNG_intro;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Iframe_practice extends TestBase {

    @Test
    public void test1(){

        driver.get("https://www.toolsqa.com/iframe-practice-page/");

        //to be able to store as a linktext My tag should be "a"

        List<WebElement> iframe = driver.findElements(By.xpath("//iframe"));
        System.out.println(iframe.size());

        //switching with the name
//        driver.switchTo().frame("iframe2");
        WebElement iframe2 = driver.findElement(By.xpath("//iframe[@id='IF2']"));

//        driver.switchTo().frame(1);

//        driver.switchTo().frame("iframe2");
        driver.switchTo().frame(iframe2);

        String sortable=driver.findElement(By.linkText("Sortable")).getText();



        System.out.println(sortable);

    }


}
