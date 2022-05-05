package conctrolStatements;

import org.junit.jupiter.api.Test;

public class SwitchStatements {
    String browser = "chrome";


    @Test
    public void switchDemo(){
        switch (browser){
            case "chrome":
                System.out.println("This is chrome browser");
                break;
            case "forefox":
                System.out.println("this is a firefox");
                break;
            case "ie":
                System.out.println("this is a ie browser");
                break;
            case "edge":
                System.out.println("this is edge browser");
                break;
            default:
                System.out.println("not a valid browser");
        }
    }
}
