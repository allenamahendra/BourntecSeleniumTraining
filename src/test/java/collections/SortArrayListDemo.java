package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArrayListDemo {

    @Test
    public void arrayListDemo(){

        List<String>browsers=new ArrayList();
        browsers.add("firefox");
        browsers.add("chrome");
        browsers.add("safari");

        //System.out.println(browsers);
        System.out.println("this is before sort " +browsers);


        Collections.sort(browsers);
        System.out.println("this is after sort " +browsers);


    }

}
