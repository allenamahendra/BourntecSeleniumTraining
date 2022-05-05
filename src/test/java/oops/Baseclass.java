package oops;

import org.junit.jupiter.api.Test;

public class Baseclass {
    String browser = "chrome";
    static String staticBrowser = "chrome";
    String url = "www.google.com";
    int nonstatic=0;
    static int Static =0;

// default constructor
    Baseclass(){ // method name and class name are same
        System.out.println("default constructor");


    }

    public Baseclass(String browser) {
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("chrome browser is opened");
        }else
        if (browser.equalsIgnoreCase("firefox")){
            System.out.println("firefox browser is opened");
        }
    }

    public void openBrowser(){
        nonstatic++;
        Static++;
        System.out.println("open chrome browser");
    }
    public  void openStaticBrowser(){
        nonstatic++;
        Static++;
        System.out.println("open static  chrome browser");
    }
    public void closeBrowser(){
        System.out.println("close chrome browser");
    }

    public void browser() {
    }
}
