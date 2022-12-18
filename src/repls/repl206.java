package repls;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class repl206 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Set<Map.Entry<String, String>> entrySet=map.entrySet();

        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("--------------");

        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
