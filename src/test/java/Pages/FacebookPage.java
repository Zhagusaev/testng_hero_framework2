package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver("firefox"),this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='pass']")
    public WebElement passwdBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButton;

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchBox;

    @FindBy(linkText = "Ruslan Janybekov")
    public WebElement russButton;

}
