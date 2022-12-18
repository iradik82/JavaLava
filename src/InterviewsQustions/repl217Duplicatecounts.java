package InterviewsQustions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class repl217Duplicatecounts {
    public static void main(String[] args) {
        List<Integer>bob=new ArrayList<>();
        bob.add(12);
        bob.add(3);
        bob.add(9);
        bob.add(5);
        bob.add(4);
        bob.add(1);
        bob.add(12);
        bob.add(1);

        System.out.println(countDuplicates(bob));
    }

    static int countDuplicates(List<Integer> numbers) {
        List<Integer>lol=new ArrayList<>(numbers);
        HashSet<Integer> bro = new HashSet<>();

        for (int i = 0; i <lol.size() ; i++) {
           // int n=lol.get(i);
            for (int j = i+1; j <lol.size() ; j++) {
                if(lol.get(j)==lol.get(i)){
                    bro.add(lol.get(j));
                }
            }
        }
        return bro.size();
    }
}
