package TestNG_intro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_parameter {


    @Test
    @Parameters("browser")
    public void test1(String browser){

        System.out.println("This the example for parametarization in TestNG. " +
                "Paramater is "+browser);

    }

    // create one more test inside test class
    //give the parameter as a OS
    // add one more paramter in xml file.
    // run it.


    @Test
    @Parameters({"OS","browser"})
    public void test1(String OS,String browser){

        System.out.println("This the example for parametarization in TestNG. " +
                "Paramater is "+OS);

        System.out.println("This the example for parametarization in TestNG. " +
                "Paramater is "+browser);

    }
}
