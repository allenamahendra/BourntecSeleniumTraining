package testNg;


import org.testng.annotations.*;

public class TestCaseAnnoations{
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }

    @Test
    public void testCase1(){
        System.out.println("this is test case1");
    }
    @Test
    public void testCase2(){
        System.out.println("this is test case2");
    }
    @Test
    public void testCase3(){
        System.out.println("this is test case3");
    }



}
