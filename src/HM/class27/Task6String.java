package HM.class27;

import java.util.LinkedHashSet;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task6String {
    public static void main(String[] args) {
        LinkedHashSet<String>letters=new LinkedHashSet<>();
        letters.add("W");
        letters.add("E");
        letters.add("L");
        letters.add("C");
        letters.add("O");
        letters.add("M");

        String welcome="";

        for(var Word:letters){
            welcome+=Word;
        }
        System.out.println(welcome);
    }
}
