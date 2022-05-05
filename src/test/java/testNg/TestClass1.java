package testNg;


import org.testng.annotations.Test;

public class TestClass1 extends TestBaseTestNG {


    @Test(enabled = false)
    public void testCase1(){
        driver.getCurrentUrl();
        System.out.println("this is test case1");
    }
    @Test(enabled = true)
    public void testCase2(){
        System.out.println("this is test case2");
    }

}
