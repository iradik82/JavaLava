package repls;

import java.util.ArrayList;
import java.util.Scanner;

public class rapl188 {
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        ArrayList<Integer>num1=new ArrayList<>(5);


        for (int i = 0; i <5 ; i++) {
            int n=num.nextInt();
            num1.add(n);


        }
        for (int i = 0; i <num1.size() ; i++) {
            System.out.print(num1.get(i)+" ");

        }
    }
}
