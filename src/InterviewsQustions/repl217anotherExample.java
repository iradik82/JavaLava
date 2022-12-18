package InterviewsQustions;

import java.util.*;

public class repl217anotherExample {
    public static void main(String[] args) {


    List<Integer> numbers4 = new ArrayList<>();
        numbers4.add(12);
        numbers4.add(12);
        numbers4.add(13);
        numbers4.add(13);
        numbers4.add(78);
        numbers4.add(67);
        numbers4.add(87);
        System.out.println(countDuplicates(numbers4));
}
    static int countDuplicates(List<Integer> numbers){
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num:numbers){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num,1);
            }}
        int count = 0;
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
            if(entry.getValue()>1){
                count++;

            }}
        return count;
    }}

