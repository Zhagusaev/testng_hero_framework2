package TestNG_intro;

import Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class javascriptexecutor_practice extends TestBase {

    JavascriptExecutor js;
    @Test
    public void test1(){
        js = (JavascriptExecutor)driver;
                            //method of JavascriptExecuter
        js.executeScript("window.location='https://www.expedia.com/'");
                             //method of JavascriptExecuter
//        js.executeScript("return documents.URL");
        System.out.println(js.executeScript("return document.URL"));

        System.out.println(js.executeScript("return document.title"));

        WebElement searchButton = driver.findElement(By.id("search-button-hp-package"));

        js.executeScript("arguments[0].click;",searchButton);

        js.executeScript("window.open('http://www.google.com/')");

        System.out.println(js.executeScript("return document.title"));


        String home = driver.getWindowHandle();

        Set<String> windows = driver.getWindowHandles();

        for (String window: windows){
            if(!window.equalsIgnoreCase(home)){
                driver.switchTo().window(window);
            }
        }

        System.out.println(js.executeScript("return document.title"));

        driver.switchTo().window(home);

        System.out.println(js.executeScript("return window.innerHeight"));
        System.out.println(js.executeScript("return window.innerWidth"));

        //To scroll down
        js.executeScript("window.scrollBy(0,1400)");

        js.executeScript("window.scrollBy(0,-700)");


        js.executeScript("alert('Welcome Techrorial Academy')");

        Alert alert = driver.switchTo().alert();

        alert.accept();








    }

}
