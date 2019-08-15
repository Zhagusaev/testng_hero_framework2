package stepDefs;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleSearchStepDefs {
    @Given("I am at google home page")
    public void i_am_at_google_home_page() {
        Driver.getDriver("chrome").get("https://www.google.com/");

    }

    @When("I search cucumber Cook book")
    public void i_search_cucumber_Cook_book() {
        WebElement searchBox =Driver.getDriver("chrome").findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
        searchBox.sendKeys("Cucumber Cookbook");
        searchBox.sendKeys(Keys.ENTER);
    }

    @Then("I'll get results")
    public void i_ll_get_results() {
    String expected = "Cucumber Cookbook - Google Search";
    String actual = Driver.getDriver("chrome").getTitle();
        Assert.assertEquals(actual, expected);
    }
}
