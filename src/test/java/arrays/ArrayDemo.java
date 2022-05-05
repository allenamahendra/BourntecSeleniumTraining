package arrays;

import org.junit.jupiter.api.Test;

public class ArrayDemo {


    @Test
    public void  arrayDemo(){
        String broesers [] = {"chrome", "firefox", "safari"};
        System.out.println(broesers[0]);
        System.out.println("total browsers length" + broesers.length);


        for (int i=0;i< broesers.length;i++){
            System.out.println("browsers list " +broesers[i]);

        }


    }

}
