package TestNG_intro;

import Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Alerts_Practice extends TestBase {


    @Test()
    public static void test1(){

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        jsAlert.click();

        Alert alert=driver.switchTo().alert();

        alert.accept();

        List<WebElement> names=driver.findElements(By.xpath("//li//button"));

        for(int i=0;i<names.size();i++){

            if(names.get(i).getText().equals("Click for JS Confirm")) {
                System.out.println(names.get(i).getText());
            }
        }

    }


    @Test
    public static void test2(){

        WebElement jsConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        jsConfirm.click();

        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.dismiss();

        String actual=driver.findElement(By.id("result")).getText();

        String expected="You clicked: Cancel";

        Assert.assertEquals(expected,actual);

        System.out.println("This is the validation for JSCONFIRM");

    }


    @Test
    public static void test3(){

        WebElement jsPrompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        jsPrompt.click();

        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.sendKeys("Techtorial Academy JS Prompt Alert");

        alert.accept();

        String actual=driver.findElement(By.id("result")).getText();

        String expected="You entered: Techtorial Academy JS Prompt Aler";

        Assert.assertTrue(actual.equals(expected));

        //Assert.assertEquals(actual,expected,"This is for assert equals method");
    }






}


