package Tests;

import Pages.FacebookPage;
import Utilities.Driver;
import Utilities.PropertiesFileIntro;
import Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FaceBook_testing extends TestBase {

    FacebookPage page = new FacebookPage();
    PropertiesFileIntro info = new PropertiesFileIntro();

    @Test
public void test()throws Exception{

    driver.get("https://www.facebook.com/");
    page.emailBox.sendKeys(info.getValue("email"));
    page.passwdBox.sendKeys(info.getValue("passwordF"));
    page.logInButton.click();
    page.searchBox.sendKeys("ruslan janybekov");
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    page.searchBox.sendKeys(Keys.ENTER);


    }
}
