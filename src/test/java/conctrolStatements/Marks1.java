package conctrolStatements;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Marks1 {
    double a = 0, b = 40, c = 60, d = 80, e = 100;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your marks : ");
        double marks = in.nextDouble();
    }

        @Test
        public void operators(){
            if ((a > 0) && (b < 40)) {
                System.out.println("fail");
            } else if ((b >= 40) && (c < 60)) {
                System.out.println("pass");
            }
        }
    }



