package HM.HMiarrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class wordlist {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>(5);
        word.add("Table");
        word.add("Phone");
        word.add("Computer");
        word.add("bottle");
        word.add("person");

        Iterator<String>bob= word.listIterator();
         while (bob.hasNext()){
             if(bob.next().endsWith("e")){
                 bob.remove();
             }
         }
        System.out.println(word);
    }
}
