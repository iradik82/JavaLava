package HM.class26;
/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */

import java.util.HashSet;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        HashSet<String>countries=new HashSet<>();
         countries.add("Ukraine");
         countries.add("Poland");
         countries.add("Moldova");
         countries.add("USA");
         countries.add("Canada");

        System.out.println(countries);


        System.out.println(new TreeSet<>(countries));


    }
}
