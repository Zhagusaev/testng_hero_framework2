package TestNG_intro;

import Pages.WebOrdersLoginPage;
import Utilities.PropertiesFileIntro;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class PropertiesPractice extends TestBase {

    PropertiesFileIntro object = new PropertiesFileIntro();

    @Test
    public void loginTest() throws Exception{

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebOrdersLoginPage page = new WebOrdersLoginPage();

        page.userName.sendKeys(PropertiesFileIntro.getValue("login"));
        page.password.sendKeys(PropertiesFileIntro.getValue("password"));
        page.loginButton.click();
        System.out.println(PropertiesFileIntro.getValue("environment"));



    }

}
