package Tests;

import Pages.Instagram_page;
import Utilities.Driver;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class Instagram_Practice extends TestBase {

    @Test
    public void test(){
        driver.get("https://ok.ru/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");

        Instagram_page page = new Instagram_page();


    }


}
