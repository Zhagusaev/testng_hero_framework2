package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KayakFlightBookingDefs {

    @Given("Kayak (\\S+) page is open")
    public void kayak_flight_page_is_open(String page) {
        System.out.println("Loading "+page+" page");
    }

    @When("user search for one way flight from Chicago to New York on {int}\\/{int}\\/{int}")
    public void user_search_for_one_way_flight_from_Chicago_to_New_York_on(Integer int1, Integer int2, Integer int3) {
//        System.out.println("flight at:"+ int1+ int2+ int3);
    }

    @Then("{int} or more  flights for given dates are displayed")
    public void or_more_flights_for_given_dates_are_displayed(Integer int1) {

    }

    @When("user searches for hotel in Istanbul on {int}\\/{int}\\/{int}")
    public void user_searches_for_hotel_in_Istanbul_on(Integer int1, Integer int2, Integer int3) {

    }

    @When("chooses to stay from {int}\\/{int}\\/{int} to {int}\\/{int}\\/{int}")
    public void chooses_to_stay_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {

    }

    @Then("list of hotels are shown")
    public void list_of_hotels_are_shown() {

    }

    @Given("I navigate to (\\S+)")
    public void i_navigate_to_google_com() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
