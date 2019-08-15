package TestNG_intro;

import org.testng.annotations.*;

public class testng_practice {






    @Test
    public static void testng1(){

        System.out.println("TestNG --> test annotation 1");
    }

    @Test
    public static void testng2(){

        System.out.println("TestNG --> test annotation 2");
    }

    @Test
    public static void testng3(){

        System.out.println("TestNG --> test annotation 3");
    }

    @AfterMethod
    public static void afterMethod(){

        System.out.println("After Method Annotation");
    }

    @BeforeMethod
    public static void beforeMethod(){

        System.out.println("Before method annotation");

    }

    @AfterClass
    public static void afterClass(){

        System.out.println("After Class annotation");

    }

    @BeforeClass
    public static void beforeClass(){

        System.out.println("Before Class annotation");
    }





}
