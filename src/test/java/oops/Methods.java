package oops;

import org.junit.jupiter.api.Test;

public class Methods {

    @Test
    public void testingMethods(){
        openChromeBrowser();
        openChromeBrowser();
        System.out.println(checkIfChromeBrowserIsOpened());

    }

    public boolean checkIfChromeBrowserIsOpened(){
        return  true;
    }


    public void openChromeBrowser(){
        System.out.println("opening chrome browser");


    }

    public void openFirefoxBrowser(){

    }
    public void openEdgeBrowser(){

    }




}
