package Tests;

import Utilities.TestBase;
import Utilities.Driver;
import org.testng.annotations.Test;

public class TestingNew {

    @Test
    public void test(){

        Driver.getDriver("chrome").get("https://www.instagram.com/");

//        driver.get("https://www.google.com/?client=safari");

    }


}
