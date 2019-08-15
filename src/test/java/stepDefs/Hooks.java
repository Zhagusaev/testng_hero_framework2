package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class);

    @Before (order = 200)
    public void setUp(){
        //setting up a browser
    }

    @Before ("@smoke")
    public void setUp1(){
        //setting up a browser
    }

    @Before ("@dataTable")
    public void setUp2(){
        //setting up a browser
    }

    @After
    public void tearDown(){
        //sign out
        //quit browser
    }


}
