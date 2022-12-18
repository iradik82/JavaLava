package repls;

import java.util.LinkedHashSet;

public class repl199 {
    public static void main(String[] args) {
        LinkedHashSet<String>val=new LinkedHashSet<>();
        val.add("Null");
        val.add("Sohil");
        val.add("Diego");
        val.add("Alijon");
        val.add("Asel");
        val.add("Sumair");

        for (String bob:val
             ) {
            System.out.println(bob);
        }
        var lol=val.iterator();
        while (lol.hasNext()){
            System.out.println(lol.next());
        }
    }
}
