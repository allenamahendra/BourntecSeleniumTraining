package conctrolStatements;

import org.junit.jupiter.api.Test;

public class Marks {
    //result of the students according to the given input of the student marks.
   // int a = 0, b = 40, c = 60, d = 80, e = 100;
    double marks =80;
    @Test
    public void operators(){
        if(marks<0){
            System.out.println("Given data is invalid");
        }else
        if((marks>=0) && (marks<40)){
        System.out.println("Fail");
    }else
        if((marks>=40) && (marks<60)){
        System.out.println("Passed");
    }else
        if ((marks>=60)&&(marks<80)){
            System.out.println("First class ");
        }else
         if ((marks>=80)&&(marks<=100)){
             System.out.println("Distinction");
         }else
             if (marks>100){
                 System.out.println("Given data is invalid");
             }

    }
}
