package repls;

import java.util.ArrayList;

public class repl183 {
    public static void main(String[] args) {
        ArrayList<String>word=new ArrayList<>();
        word.add("hi");
        word.add("yo");
        word.add("sup");
        word.add("yolo");
        word.add("boop");

        word.remove(0);
        word.remove("sup");
        word.remove("boop");


        for (int i = 0; i <word.size() ; i++) {
            System.out.print(word.get(i)+" ");

        }


        }

    }

