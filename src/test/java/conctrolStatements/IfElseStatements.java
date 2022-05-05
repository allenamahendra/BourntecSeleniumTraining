package conctrolStatements;

import org.junit.jupiter.api.Test;

public class IfElseStatements {
    String browser = "ksv";

    @Test
    public void ifElseDemo(){
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("open chrome browser");
        }else
        if (browser.equalsIgnoreCase("ie"))
        {
            System.out.println("open ie browser");
        }else

        {
            System.out.println("this is not a browser");
        }
    }
}
