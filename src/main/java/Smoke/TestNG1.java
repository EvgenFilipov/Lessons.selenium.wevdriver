package Smoke;

import org.testng.annotations.Test;

public class TestNG1 {

    @Test
    public void test1(){
        System.out.println("Test1");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test11(){
        System.out.println("Test11");
    }
//    @Test(groups = {"regress"})
//    public void test111(){
//        System.out.println("Test111");
//    }

}

