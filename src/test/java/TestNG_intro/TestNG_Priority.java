package TestNG_intro;

import org.testng.annotations.Test;

public class TestNG_Priority {

    @Test(priority = 1)
    public static void testng3(){

        System.out.println("TestNG --> test annotation 3");
    }

    @Test(priority = 2, enabled = false)
    public static void testng2(){

        System.out.println("TestNG --> test annotation 2");
    }

    @Test(priority = 3)
    public static void testng1(){

        System.out.println("TestNG --> test annotation 1");
    }



}
