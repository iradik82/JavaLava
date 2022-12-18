package repls;

import java.util.LinkedList;

public class repl193 {
    public static void main(String[] args) {
        LinkedList<Integer>bob=new LinkedList<>();
        bob.add(111);
        bob.add(222);
        bob.add(333);
        bob.add(444);
        bob.add(555);
        bob.add(666);
int lol=0;
        for (int i = 0; i <bob.size() ; i++) {
           lol=lol+bob.get(i);
        }
        System.out.println(lol);


    }
}
