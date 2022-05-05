package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    @Test
    public void arrayListDemo() {
        List<String> browsers = new ArrayList();
        browsers.add("chrome");
        browsers.add("firefox");
        browsers.add("edge");
        browsers.add("safari");

        System.out.println("browsers size : " + browsers.size());
        System.out.println(browsers);


        // iterator

        Iterator itr = browsers.iterator();
        while (itr.hasNext()) {
            System.out.println("browser using teratoe " + itr.hasNext());
            //for (int i = 0;i<browsers.size();i++);
            //System.out.println("browser using for forloop "+browsers);
        }
        int i;
        for (i = 0; i < browsers.size(); i++) ;
        System.out.println("browser using for forloop " + browsers.get(i));

    }


}
