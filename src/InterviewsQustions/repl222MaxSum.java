package InterviewsQustions;

import java.util.ArrayList;
import java.util.List;

public class repl222MaxSum {
    public static void main(String[] args) {
        List<Integer>lol=new ArrayList<>();
        lol.add(10);
        lol.add(20);
        lol.add(30);
        lol.add(40);

        System.out.println(sumOftwolarge(lol));
    }


    public static int sumOftwolarge(List<Integer>bob){
        int sum=0;
        int FirstLarge=0;
        int SecondLarge=0;

        for(int lol:bob){
            if(lol>FirstLarge){
                FirstLarge=lol;
            }
        }
        for (int lol:bob){
            if(lol>SecondLarge&&lol != FirstLarge){
                SecondLarge=lol;
            }
        }
         sum=FirstLarge+SecondLarge;



        return sum;
    }
}
