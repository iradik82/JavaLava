package repls;

import java.util.HashSet;

public class repl195 {
    public static void main(String[] args) {
        HashSet<Integer>num=new HashSet<>();
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(999);
        num.add(999);
        num.add(999);

        for (Integer bob:num
             ) {
            System.out.println(bob);

        }
    }
}
