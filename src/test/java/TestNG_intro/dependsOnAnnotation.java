package TestNG_intro;

import org.testng.annotations.Test;

public class dependsOnAnnotation {

    @Test(dependsOnMethods = "test2")
    public void test1(){

        System.out.println("Test 1 method");

    }


    @Test(dependsOnMethods = "test3")
    public void test2(){

        System.out.println("Test 2 method");

    }

    @Test()
    public void test3(){

        System.out.println("Test 3 method");
    }


}
