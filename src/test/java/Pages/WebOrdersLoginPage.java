package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrdersLoginPage {

    public WebOrdersLoginPage(){
        PageFactory.initElements(Driver.getDriver("chrome"),this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;


}
