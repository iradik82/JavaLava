package ReviewClass.class13;

import java.util.HashMap;
import java.util.Map;

public class interviewTaskStringToCharCountLetters {

  // create a method that returns a map characters and and their count in a String


        static void characterCount(String str)
        {
            // Creating a HashMap containing char
            // as a key and occurrences as  a value
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            // Converting given string to char array

            char[] strArray = str.toCharArray();

            // checking each char of strArray
            for (char c : strArray) {
                if (map.containsKey(c)) {

                    // If char is present in charCountMap,
                    // incrementing it's count by 1
                    map.put(c, map.get(c) + 1);
                }
                else {

                    // If char is not present in charCountMap,
                    // putting this char to charCountMap with 1 as it's value
                    map.put(c, 1);
                }
            }

            // Printing the charCountMap
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        public static Map<Character,Integer>getCount(String str){
            char[]charArr=str.toCharArray();
            Map<Character,Integer>map=new HashMap<>();
            for(char c:charArr){
           if (map.get(c)==null){
               map.put(c,1);
           }else{
               int count=map.get(c);
               count=count+1;
               map.put(c,count);
           }
            }return map;
        }

    public static void main(String[] args) {
        String str="jdshfkjsdhfkjjkfsahlajdhfejwhre";

        interviewTaskStringToCharCountLetters.characterCount(str);

        System.out.println(getCount(str));

    }
}
