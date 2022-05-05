package stringFunctions;

import com.sun.jdi.IntegerValue;
import org.junit.jupiter.api.Test;

public class StringtToInteger {

    @Test
    public void stringToInteger(){
        String st = "526";

        Integer Value=Integer.parseInt(st);
        System.out.println(Value);
        int number = 20;
        int addition = Value+number;
        System.out.println("convertion of string "+addition);

        String st2 = "9441053865";
        Double value2 = Double.parseDouble(st2);
        Double number2 = 897.00;
        double sub = value2-number2;
        System.out.println("convertion of string to double "+sub);

    }
}
