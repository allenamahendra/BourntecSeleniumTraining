package oops;

import org.junit.jupiter.api.Test;

public class Methodswithparameters {

    @Test
    public void testingMethods(){
        openBrowser("chrome");
        openBrowser("edge");
      //  System.out.println(checkIfChromeBrowserIsOpened());
        int sum1 = getSumOfNumbers (2,4);
        int sum2 = getSumOfNumbers (10,11);
        System.out.println("sum1 "+ sum1);
        System.out.println("sum2 "+ sum2);

    }

    private int getSumOfNumbers(int firstnum, int secondnum) {
        int sum=firstnum+secondnum;
        System.out.println("sum = " + sum);
        return sum;
    }

    public boolean checkIfChromeBrowserIsOpened(){
        return  true;
    }


    public void openBrowser(String browser){
        System.out.println("opening browser:"+browser);


    }
}
