package Javademo;

import org.junit.jupiter.api.Test;

public class JunitDemo {
    long mobilenumber = 944105386;
    @Test
    public void testingjunit1(){
        System.out.println("welcome  QA team");
        System.out.println("lets start the session ");
        System.out.println("about the variables & data types");
        long mobilenumber = 944105386;
        String accNumber = "9441053865";
        String email = "amjndcs@gmail.com";
        boolean testcasesstatus = true;
        double produtprise = 150.85;
        float productprise1 = 1025;
        String orderId = "015475";
        System.out.println("mobile number is : "+mobilenumber);
        System.out.println("account number : "+accNumber);
        System.out.println("order id " +orderId);
        System.out.println("status of the test case "+testcasesstatus);


    }
    @Test
    public void testingjunit2(){
   //     System.out.println("testing junit");
        System.out.println("mobile number is : "+mobilenumber);

    }
    @Test
    public void testingjunit3(){
   //     System.out.println("welcome to QA team");
   /*     System.out.println("lets start the session ");*/
   /*     System.out.println("testing junit");*/

    }
    @Test
    public void  testingunit4(){
        double produtprise = 150.85;
        float productprise1 = 1025;
        String orderId = "015475";
        System.out.println("order id is "+orderId);

    }
}
