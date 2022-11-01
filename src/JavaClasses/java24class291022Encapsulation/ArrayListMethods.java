package JavaClasses.java24class291022Encapsulation;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<String> colors=new ArrayList<>();
        //use add method to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
        //   colors.remove("Blue");
        colors.remove(2);
        System.out.println(colors);

        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(35);

        int a=34;
        number.add(a);
        System.out.println(number);


        for(Integer num:number){
            System.out.println(num);
        }

        //int => Integer
        // boolean => Boolean
        // byte => Byte
        // double => Double
        // long => Long
        // float => Float
        // char => Character

        //how to store chars in arrayList
        // ArrayList<Character> chars=new ArrayList<>(new ArrayList<>(Arrays.asList('E','F')));
        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5F);
        floats.add(12f);
        System.out.println(floats);

        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Josh");
        names.set(2,"Josh Again");
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);
        numbers.set(0,12000);
        System.out.println(numbers);
        numbers.clear(); // deletes all the elements from the list
        System.out.println(numbers);
    }
}


