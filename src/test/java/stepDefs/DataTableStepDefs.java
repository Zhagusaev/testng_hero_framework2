package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


import java.util.List;
import java.util.Map;

public class DataTableStepDefs {

    @Given("the following users exist:")
    public void the_following_users_exist(DataTable table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

//        List<List<String>> lists = table.asLists(String.class);

        List<Map<String, String>> stringMap = table.asMaps(String.class, String.class);
//        System.out.println("Emails from datatable: "+stringMap.get(1).get("twitter"));

//        for (Map map:stringMap) {
//            System.out.println("Name is:"+map.get("name")+" and email:"+ map.get("email")+" and Twitter:"+ map.get("twitter"));
//        }

        System.out.println(stringMap);

//        for (int i=0;i<stringMap.size();i++){
//            System.out.println(stringMap.get(i).get());
//        }

        System.out.println(stringMap.get(0).get("name"));


//        for (List<String> list:lists) {
//            System.out.println(list.get(1));
//        }
//        System.out.println(lists.get(2).get(1));
    }



    @When("user writes email to Aslak")
    public void user_writes_email_to_Aslak() {

    }

    @Then("Aslak responds")
    public void aslak_responds() {

    }
}
