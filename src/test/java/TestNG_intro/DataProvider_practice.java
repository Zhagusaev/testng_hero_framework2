package TestNG_intro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_practice {

    @DataProvider(name = "identity")
    public Object[][]getData(){
        return new Object[][]{
                {"Muammer", "Turan"},
                {"Arslan","Kabul"},
                {"Temirlan","Nurkul"}
        };
    }
    @Test(dataProvider = "identity")
    public void test1(String firstName, String lastName){

        System.out.println("The firstName is "+firstName);
        System.out.println("The lastName is "+lastName);


    }

}
