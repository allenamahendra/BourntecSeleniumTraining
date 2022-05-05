package arrays;

import org.junit.jupiter.api.Test;

public class TwoDimArrayDemo {


    @Test
    public void  arrayDemo(){
        String tabdata [][] = new String[2][4];

        tabdata[0][0] = "s. no";
        tabdata[0][1] = "Name";
        tabdata[0][2] = "Location";
        tabdata[0][3] = "skills";


        tabdata[1][0] = "1";
        tabdata[1][1] = "selenium";
        tabdata[1][2] = "hyderabad";
        tabdata[1][3] = "tosca";




       // String broesers [] = {"chrome", "firefox", "safari"};
       // System.out.println(broesers[0]);


        System.out.println("total table length" + tabdata.length);


        for (int i=0;i< tabdata.length;i++){
            System.out.println(" list of the data " +tabdata[i][0]);
        System.out.println(" list of the data " +tabdata[i][1]);
        System.out.println(" list of the data " +tabdata[i][2]);
            System.out.println(" list of the data " +tabdata[i][3]);
        //System.out.println(" list of the data " +tabdata[1][0]);
        //System.out.println(" list of the data " +tabdata[1][1]);
        //System.out.println(" list of the data " +tabdata[1][2]);

        }


    }

}
