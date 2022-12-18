package repls;

import java.util.LinkedList;

public class repl190 {
    public static void main(String[] args) {
        LinkedList<Integer> fiba=new LinkedList<>();

            int num1 = 0, num2 = 1;
            int count = 0;
            // Iterate till counter is N
            while (count < 10) {
                fiba.add(num1);
                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                count ++;
            }
        for (int i = 0; i <fiba.size() ; i++) {
            System.out.print(fiba.get(i) + " ");
        }
    }
        }



