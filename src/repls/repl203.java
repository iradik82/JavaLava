package repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class repl203 {
    public static void main(String[] args) {
        HashMap<String,Integer> fruits=new HashMap<>();
        fruits.put("mango",10);
        fruits.put("apple",30);
        fruits.put("orange",20);
        fruits.put("mango",40);
        fruits.put("mango",40);

        Iterator<Map.Entry<String, Integer>> itr = fruits.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    " and value = " + entry.getValue());
        }
    }
}
