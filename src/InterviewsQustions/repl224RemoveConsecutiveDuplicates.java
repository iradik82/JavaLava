package InterviewsQustions;

import java.util.ArrayList;
import java.util.List;

public class repl224RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
        System.out.println(removeConsecutiveDuplicates("aabbcc"));
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));


    }
    public static String removeConsecutiveDuplicates(String input) {

        char[]bob=input.toCharArray();
        List<Character>lolka=new ArrayList<>();
        for (char c : bob) {
            lolka.add(c);
        }
        String str="";
        for (int i = 0; i <lolka.size() ; i++) {
            if(str.isEmpty()){
                str=str+lolka.get(0);
            }else if(lolka.get(i)!=lolka.get(i-1)){
                str=str+lolka.get(i);
            }
        }

        return str;
    }
}
