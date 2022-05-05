package oops;

import org.junit.jupiter.api.Test;

public class ObjectDemo {
    @Test
    public void baseclass(){
        Baseclass baseclass = new Baseclass();

        baseclass.openBrowser();
        baseclass.closeBrowser();
        System.out.println(baseclass.browser);



    }

}
