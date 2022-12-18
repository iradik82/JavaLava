package repls;

import java.util.ArrayList;

public class Repl191 {
    public static void main(String[] args) {
        ArrayList<Boolean>listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean>listB=new ArrayList<>();

        for (int i = 0; i <listA.size() ; i++) {
            boolean bob=listA.get(i);
            listB.add(bob);

        }
        var iterator=listB.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
