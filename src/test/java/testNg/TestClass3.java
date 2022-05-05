package testNg;

import org.testng.annotations.Test;

public class TestClass3 extends  TestBaseTestNG {
    @Test(groups = {"SMOKETEST"})
    public void testCase5(){
        System.out.println("this is test case5");
    }
    @Test(groups ={"REGRESSIONTEST"})
    public void testCase6(){
        System.out.println("this is test case6");
    }
    @Test(groups = {"SMOKETEST"})
    public void testCase7(){
        System.out.println("this is test case7");
    }
    @Test(groups ={"REGRESSIONTEST"})
    public void testCase8(){
        System.out.println("this is test case8");
    }

}
