package repls;

import java.util.LinkedList;

public class repl189 {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<>();

        for (int i = 50; i < 100; i++) {
            linky.add(i);
        }
        var iterator = linky.iterator();
        while (iterator.hasNext())
            if (iterator.next() % 3 != 0) {
                iterator.remove();

            }

        System.out.println(linky);
    }
}















