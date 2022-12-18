package repls;

import java.util.LinkedHashSet;

public class repl196 {
    public static void main(String[] args) {
        LinkedHashSet<String>words=new LinkedHashSet<>();
        words.add("third");
        words.add("first");
        words.add("second");
        System.out.println(words);
        words.clear();
        System.out.println(words);
    }
}
