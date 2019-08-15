package TestNG_intro;

import Pages.WebOrdersLoginPage;
import Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_dataProvider extends TestBase {

    WebOrdersLoginPage page = new WebOrdersLoginPage();

    @DataProvider(name = "inputs")

    public Object[][]getData(){
        return new Object[][]{
                {"Tester","techtorial"},
                {"TT","test"},
                {"Tester","test"}
        };
    }

    @Test(dataProvider = "inputs")
    public void loginTest(String username, String password){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        page.userName.sendKeys(username);
        page.password.sendKeys(password);
        page.loginButton.click();

        String actual = driver.getTitle();
        String expected = "Web Orders";
        Assert.assertEquals(expected,actual);
        

    }

}
