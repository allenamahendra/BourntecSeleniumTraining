package stringFunctions;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Contains {

    @Test
    public void contains(){
        String actualvalue="Record number : '123456' created sucessfully";
        String expectedvalue="Created Sucessfully";

        if (actualvalue.toLowerCase().contains(expectedvalue.toLowerCase())){
            System.out.println("pass");
        }else{
            System.out.println("Fail");

        }
        if (actualvalue.toLowerCase().endsWith(expectedvalue.toLowerCase())){
            System.out.println("pass");
        }else{
            System.out.println("Fail");

        }




    }

}
