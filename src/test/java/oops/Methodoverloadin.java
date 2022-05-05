package oops;

import org.junit.jupiter.api.Test;

public class Methodoverloadin {

    @Test
    public void testMethodOverLoading(){
        testCaseStatus();
        testCaseStatus("pass");
        testCaseStatus("path","screenshotpath1");
        testCaseStatus("pass", Integer.parseInt("1"),"screenshotpath1");


    }
    void testCaseStatus(){
        System.out.println("no parameters");

    }
    void  testCaseStatus(String status){
        System.out.println(status);

    }
    void  testCaseStatus(String status, String screenshot){
        System.out.println(status);
        System.out.println(screenshot);

    }
    void  testCaseStatus(String status,int testCaseCount, String screenshot){
        System.out.println(status);
        System.out.println(testCaseCount);
        System.out.println(screenshot);

    }


}
