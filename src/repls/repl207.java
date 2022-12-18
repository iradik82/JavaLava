package repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class repl207 {
    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

       while (it.hasNext()){
            System.out.println(it.next());
        }

       map.replace("THREE","ASEL");
        map.replace("FIVE","SUMIAR");

        System.out.println("--------------");

        for(var maps:map.entrySet()) {
            System.out.println(maps);

        }
    }
}