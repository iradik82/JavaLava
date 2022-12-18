package JavaClasses.java27class061122Lists;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {

            HashMap<String,Double> fruit=new HashMap<>();
            fruit.put("Apple",1.99);
            fruit.put("Mango",2.99);
            fruit.put("Orange",4.99);
            fruit.put("Banana",10.1);



       /* Set<String>keySet=fruit.keySet();
        System.out.println(keySet);

        var values=fruit.values();
        System.out.println(values);
*/

        var allKeys=fruit.keySet();
        System.out.println(allKeys);

        Iterator<String> iterator=allKeys.iterator();
        while (iterator.hasNext()){
            String item= iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }

        }
        System.out.println(fruit);

    }
}
