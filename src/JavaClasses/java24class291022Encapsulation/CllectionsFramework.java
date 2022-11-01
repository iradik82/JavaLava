package JavaClasses.java24class291022Encapsulation;

import java.util.ArrayList;

public class CllectionsFramework {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");

        System.out.println(colors);
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        System.out.println(colors.size());

        System.out.println("****************");

        for (int i = 0; i <colors.size() ; i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("****************");
        for(String x:colors){
            System.out.println(x);
        }
    }
}