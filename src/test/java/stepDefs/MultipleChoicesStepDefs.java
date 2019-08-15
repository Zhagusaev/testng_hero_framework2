package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultipleChoicesStepDefs {

    private static final Logger LOG = LoggerFactory.getLogger(MultipleChoicesStepDefs.class);

    @Given("the grocery store is open")
    public void the_grocery_store_is_open() {

    }

    @When("We go to the store")
    public void we_go_to_the_store() {

    }

    @Then("User buys {int} and {int}")
    public void user_buys_and(int apples, int carrots) {

        LOG.info("We are buying {} apples and {} carrots", apples, carrots);
    }

}
