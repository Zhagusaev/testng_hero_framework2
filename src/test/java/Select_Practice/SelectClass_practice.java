package Select_Practice;


import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectClass_practice extends TestBase {


    @Test(enabled = false)
    public static void test1() {

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown=driver.findElement(By.id("dropdown"));

        Select select=new Select(dropDown);

        select.selectByVisibleText("Option 2");

    }


    @Test(priority = 3)
    public static void test2(){

        driver.get("https://www.spicejet.com/");

        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select select=new Select(currency);

        select.selectByVisibleText("USD");

    }

    @Test(priority = 2)
    public static void test3(){

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown=driver.findElement(By.id("dropdown"));

        Select select=new Select(dropDown);

        select.selectByValue("1");

    }

    @Test(priority = 1)
    public static void test4(){


        driver.get("https://www.spicejet.com/");

        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select select=new Select(currency);

        select.selectByValue("AED");

    }


    @Test
    public static void test5(){

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown=driver.findElement(By.id("dropdown"));

        Select select=new Select(dropDown);

        select.selectByIndex(2);

    }

    @Test
    public static void test6(){


        driver.get("https://www.spicejet.com/");

        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select select=new Select(currency);

        select.selectByIndex(3);

        // getOptions will return list of webelement in my dropdown list
       List<WebElement> actualOptions= select.getOptions();

       List<String> expectedOptions=new ArrayList<>();
       expectedOptions.add("Select");
       expectedOptions.add("INR");
       expectedOptions.add("AED");
       expectedOptions.add("USD");

       String actual="actual";
       String expected="expected";


       for (int i=0; i<expectedOptions.size();i++){

               actual = actualOptions.get(i).getText();
               expected = expectedOptions.get(i);

           Assert.assertEquals(actual,expected);
       }

    }




}
