package oops;

import org.junit.jupiter.api.Test;

public class Constructors {
    @Test
    public void testConstructor(){
        Baseclass baseclass = new Baseclass();
        Baseclass baseclassparamChrome = new Baseclass("chrome");
        Baseclass baseclassparamFirefox = new Baseclass("firefox");

        baseclass.openBrowser();


    }


}
