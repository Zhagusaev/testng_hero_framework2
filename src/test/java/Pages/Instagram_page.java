package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Instagram_page {

    public Instagram_page(){
        PageFactory.initElements(Driver.getDriver("chrome"),this);
    }

    @FindBy(name = "st.email")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='field_password']")
    public WebElement password;


}
