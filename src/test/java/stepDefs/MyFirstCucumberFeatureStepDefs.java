package stepDefs;

import Utilities.Driver;
import Utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyFirstCucumberFeatureStepDefs extends TestBase {

    @When("I learn how to write scenarios")
    public void i_learn_how_to_write_scenarios() {
        System.out.println("My first system definition");
    }

    @Then("I became better tester")
    public void i_became_better_tester() {
        System.out.println("My second system definition");
    }

    @When("login to amazon")
    public void login_to_amazon() {
        System.out.println("third step definition");
    }

    @Then("I can buy an iphone")
    public void i_can_buy_an_iphone() {
        System.out.println("forth step definition");
    }

    @When("eat properly")
    public void eat_properly() {
        System.out.println("fifth step definition");
    }

    @Then("don't gain weight")
    public void don_t_gain_weight() {
        System.out.println("sixth step definition");
    }

    @When("I finish Techtorial")
    public void i_finish_Techtorial() {
        System.out.println("third step definition");
    }

    @Then("I'll become better tester")
    public void i_ll_become_better_tester() {
        System.out.println("third step definition");

    }

    @When("I navigate to my browser")
    public void i_navigate_to_my_browser() {
        System.out.println("third step definition");
    }

    @Then("I get to website")
    public void i_get_to_website() {
        System.out.println("third step definition");
    }

    @When("I get")
    public void i_get() {
        System.out.println("third step definition");
    }




}
