package arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCompare {
    //comparing of two country values before sorting and after sorting.

    @Test
    public void arrayListCompare(){
        ArrayList<String> arraylist1 = new ArrayList<>();

        arraylist1.add("India");
        arraylist1.add("Syria");
        arraylist1.add("New Zealand");
        arraylist1.add("Belgium");
        arraylist1.add("Australia");

        ArrayList<String> arraylist2 = new  ArrayList<>();

        arraylist2.add("Syria");
        arraylist2.add("India");
        arraylist2.add("New Zealand");
        arraylist2.add("Australia");
        arraylist2.add("Belgium");

        System.out.println("given list of countries before sorting : " +arraylist1);

        System.out.println("Given list of countries before sorting : " +arraylist2);


        System.out.println("comparing given data " +arraylist1.equals(arraylist2));

        Collections.sort(arraylist1);

        Collections.sort(arraylist2);

        System.out.println("Given list of the countries after sorting : "+arraylist1);

        System.out.println("Given List of the countries after sorting : "+arraylist2);

        System.out.println("comparing give data " +arraylist1.equals(arraylist2));

    }

}
