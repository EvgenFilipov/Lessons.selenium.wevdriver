package Smoke;

import org.testng.annotations.Test;

public class TestNG2 {

    @Test(groups = {"smokeTest", "regress"})
    public void test2 (){
        System.out.println("Test2");
    }
}
