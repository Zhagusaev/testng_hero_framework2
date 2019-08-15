package Tests;

import Pages.HomePage;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class xpedia_test extends TestBase{

    HomePage home=new HomePage();

    @Test(groups = {"xpedia"})
    public void test1(){

       driver.get("https://www.expedia.com/");

        home.flightButton.click();

        home.flyingFrom.sendKeys("Chicago");

        home.flyingFrom.sendKeys(Keys.ARROW_DOWN);

        home.flyingFrom.sendKeys(Keys.ENTER);

        home.flyingTO.sendKeys("Los Angeles");

        home.flyingTO.sendKeys(Keys.ARROW_DOWN);

        home.flyingTO.sendKeys(Keys.ENTER);

    }



}
